#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/23
# @Author   :chenaimei
# @Function :获取后台配置响应

import json
import requests
from src.main.readConfig import ReadConfig


class ExtraResponse():
    """
    ：获取WEB端响应的配置文件
    """
    def __init__(self):
        self.url = ReadConfig().get_http("url")

    def get_list(self):
        """
        ：获取配置响应中的list
        """
        param = dict(requestType='CONFIG', requestMessage='1')
        result = requests.post(self.url, data=param)
        result_text = json.loads(result.text)
        data = result_text.get("list")
        return data

    def get_formName(self):
        """
        :return: 获取响应配置中的formName，返回为列表
        """
        formname_list = []
        list_data = self.get_list()
        for x in list_data:
            formname_list.append(x["formName"])
        return formname_list

    def get_fieldName(self, form_name):
        """
        :param form_name: 表名
        :return: 获取配置响应中的ieldName列表
        """
        field_name_list = []
        list_data = self.get_list()
        for i in range(len(list_data)):
            if list_data[i].get('formName') == form_name:
                field_list = list_data[i].get('fields')
                for j in range(len(field_list)):
                    field_name_list.append(field_list[j].get('fieldName'))
        return field_name_list

    def get_fieldName_znName(self, form_name):
        """
        :param form_name: 表名
        :return:返回某个表下字段名 fieldName +中文 znName 的字典
        """
        field_zName = {}
        list_data = self.get_list()
        for i in range(len(list_data)):
            if list_data[i].get('formName') == form_name:
                field_list = list_data[i].get('fields')
                for j in range(len(field_list)):
                    key = field_list[j].get('fieldName')
                    value = field_list[j].get('znName')
                    field_zName[key] = value
        return field_zName
