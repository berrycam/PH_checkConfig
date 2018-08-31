#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/22
# @Author   :chenaimei
# @Function :读取配置文件

import os
import codecs
import configparser


class ReadConfig:
    """
    ：读取配置文件
    """
    def __init__(self):
        """
        ：初始化
        """
        # 获取当前文件目录的路径
        # 然后再获取当前文件目录的上级目录
        self.pro_dir = os.path.dirname(os.path.realpath(__file__))
        self.parent_dir = os.path.dirname(self.pro_dir)
        # print(self.pro_dir)
        # print(self.parent_dir)
        # 读取配置文件config.ini
        self.config_path = os.path.join(self.parent_dir, "config", "config.ini")
        with open(self.config_path, 'r', encoding='UTF-8') as source_file:
            data = source_file.read()

        # remove BOM
        # 判断是否为带BOM文件
        if data[:3] == codecs.BOM_UTF8:
            data = data[3:]
            with codecs.open(self.config_path, 'w') as dest_file:
                dest_file.write(data)
                dest_file.close()
            source_file.close()

        self.cf = configparser.ConfigParser()
        # 读配置文件返回ini，返回结果为列表
        # encoding="utf-8-sig"解决配置包含中文
        self.cf.read(self.config_path, encoding="utf-8-sig")

    def get_file_path(self, name):
        value = self.cf.get("FILE_PATH", name)
        return value

    def get_http(self, name):
        value = self.cf.get("HTTP", name)
        return value
