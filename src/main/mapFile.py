#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/24
# @Author   :chenaimei
# @Function :把表名与java文件名称对应起来

import re
from src.main.readConfig import ReadConfig


class MapFile():
    def __init__(self):
        self.map_file_path = ReadConfig().get_file_path("map_file_path")

    def get_map_file(self):
        """
        :return:把对应表.txt的数据抽取出来，表名作为字典的key，java文件名作为value
        """
        map_file_dic = {}
        regex = r"\s+|\n"
        with open(self.map_file_path, 'r', encoding='utf-8') as f:
            map_data = f.read()
            map_list = re.split(regex, map_data)
            for i in range(1, len(map_list), 2):
                map_file_dic[map_list[i]] = map_list[i-1]
            return map_file_dic
