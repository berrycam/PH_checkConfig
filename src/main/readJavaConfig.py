#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/17
# @Author   :chenaimei
# @Function :读取java配置文件

import os
import re
from src.main.readConfig import ReadConfig


class ReadJavaConfig:
    """
    ：读取JAVA配置类
    """
    def __init__(self):
        self.root_dir = ReadConfig().get_file_path("dto_file_path")

    def get_filename(self):
        """
        ：获取指定目录下的所有后缀为java的文件名
        """
        java_f_list = []
        f_list = os.listdir(self.root_dir)
        for i in f_list:
            if os.path.splitext(i)[1] == '.java':
                java_f_list.append(i)
        return java_f_list

    def get_argument(self, file_name):
        """
        ：获取指定Java文件名中的字段变量
        :param file_name:java文件名称
        :return:list列表
        """
        java_arg_list = []
        tmp = os.path.join(self.root_dir, file_name)
        file_path = tmp + '.java'
        pattern = r"(public|private|protected) (\w+|java\.util\.Date) ([a-zA-Z0-9_$]*);"
        try:
            with open(file_path, 'r', encoding='utf-8') as file:
                for line in file.readlines():
                    line_data = line.strip()
                    r_tmp = re.search(pattern, line_data)
                    if r_tmp is not None:
                        java_arg_list.append(r_tmp.group(3))
        except FileNotFoundError:
            print("请检查  " + file_name + " 文件是否存在!")
        return java_arg_list



