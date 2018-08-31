#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/27
# @Author   :chenaimei
# @Function :配置文件检查
import logging
from src.main.mapFile import MapFile
from src.main.extraResponse import ExtraResponse
from src.main.readJavaConfig import ReadJavaConfig
from src.main.listCompare import ListCompare
from src.main.writeExcel import WriteExcel

class CheckConfig():
    """
    ：配置的比对
    """
    def __init__(self):
        self.map_dic = MapFile().get_map_file()
        self.re_obj = ExtraResponse()
        self.java_obj = ReadJavaConfig()
        self.cmp_obj = ListCompare()

    def check_formName(self):
        """
        ：通过对比mapFile与ExtraResponse的表名对比
        """
        # fName 指对应表中的表名
        fName = list(self.map_dic)
        # rName 实时从服务器响应json配置文件的表名
        rName = self.re_obj.get_formName()
        tmp = self.cmp_obj.get_diff_list(fName, rName)
        if tmp == True:
            print(" App端与WEB端的表名，即formName均相同")
            logging.debug("%s:对比结果已写入excel", fName)
            return True
        else:
            f_diff, r_diff = self.cmp_obj.get_diff_list(fName, rName)
            same = self.cmp_obj.get_same_list(fName, rName)
            WriteExcel().write2excel("formNameDiff", f_diff, r_diff, same)
            return True

    def check_fieldName(self):
        """
        :param formName: 指定要进行字段对比的表名A
        ：如存在字段不相同时，输出至A.xlsx
        """
        for key in self.map_dic:
            # 该key所对就java表的所有字段list,此处易出错
            map_key = self.map_dic[key]
            field_af = self.java_obj.get_argument(map_key)
            # 响应配置中该key表下的所有字段list
            field_rf = self.re_obj.get_fieldName(key)
            tmp = self.cmp_obj.get_del_white_list(field_af, field_rf)
            if tmp is True:
                logging.info("java表《 %s》 的APP端JAVA文件与WEB后台配置的FieldName完全相同", map_key)
                print(key, "的APP端JAVA文件与WEB后台配置的FieldName完全相同")
            else:
                af_diff, rf_diff = self.cmp_obj.get_del_white_list(field_af, field_rf)
                same = self.cmp_obj.get_same_list(field_rf, field_af)
                WriteExcel().write2excel(key, af_diff, rf_diff, same)
