#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/27
# @Author   :chenaimei
# @Function :将列表写入EXCEL

import os
import logging
import xlsxwriter
from src.main.readConfig import ReadConfig
# from src.main.extraResponse import ExtraResponse

class WriteExcel():
    def __init__(self):
        self.path = ReadConfig().get_file_path("result_path")
        os.chdir(self.path)

    def write2excel(self, arg_fileName, java_list, json_list, same_list):
        """
        :param arg_fileName: 进行字段对比的文件名，如A
        :param java_list: 该文件名A所对应java文件中的字段
        :param json_list: 该文件名A所对应json配置中的字段
        :param json_list: 该文件名A中，java与json均包含的字段
        :将上述arg_fileName作为excel的文件名，字段写入excel列
        """
        # print (self.path + arg_fileName + ".xlsx")
        workbook = xlsxwriter.Workbook(arg_fileName + '.xlsx')

        worksheet = workbook.add_worksheet("字段对比结果")
        # 设置列宽与行高
        worksheet.set_column('A:C', 36.0)
        # 写入表头
        worksheet.write(0, 0, "仅JAVA端有：")
        worksheet.write(0, 1, "仅WEB端有：")
        worksheet.write(0, 2, "JAVA端与WEB端均包含：")
        # 将java_list 写入Excel的第1列
        for i in range(len(java_list)):
            worksheet.write(i+1, 0, java_list[i])
            print(java_list[i])

        # 将json_list 写入Excel的第2列
        for j in range(len(json_list)):
            worksheet.write(j+1, 1, json_list[j])
            print(json_list[j])

        # 将same_list 写入Excel的第3列
        for k in range(len(same_list)):
            worksheet.write(k+1, 2, same_list[k])

        # 将field_zName 插入Excel的第3列，未写完
        # if arg_fileName != "formNameDiff":
        #     zName = {}
        #     zName = self.re_obj.get_fieldName_znName(arg_fileName)
        #     for j in range(len(json_list)):
        #         worksheet.write(j+1, 1, json_list[j])

        print(arg_fileName + " : 对比结果已写入Excel ! ")
        logging.debug("%s:对比结果已写入excel", arg_fileName)
        # PermissionError: [WinError 32] 另一个程序正在使用此文件，进程无法访问。
        # : 'C:\\Users\\CHENAI~1\\AppData\\Local\\Temp\\tmpzn90083y'
        workbook.close()
