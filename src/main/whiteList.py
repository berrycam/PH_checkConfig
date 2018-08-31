#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/24
# @Author   :chenaimei
# @Function :读取白名单
from src.main.readConfig import ReadConfig


class WhiteList():
    def __init__(self):
        self.white_list_path = ReadConfig().get_file_path("white_list_path")

    def discard_white_list(self, arg_list):
        """
        :return:返回剔除了白名单所包含字段的list
        """
        white_list = []
        # 使用set集合做差集，剔除白名单字段
        # 其中做切片是为了去除尾部的分号
        set_arg = set(arg_list)
        with open(self.white_list_path, 'r', encoding='UTF-8') as file:
            for line in file.readlines():
                tmp = line.strip()
                line = tmp[:-1]
                if line is not None:
                    white_list.append(line)
        for i in range(len(white_list)):
            set_arg.discard(white_list[i])
        return list(set_arg)
