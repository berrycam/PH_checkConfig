#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/24
# @Author   :chenaimei
# @Function :公共类，用于对比两个list

from src.main.whiteList import WhiteList


class ListCompare():
    """
    ：
    """
    def get_diff_list(self, java_list, json_list):
        """
        :return:对比两个list，返回两个list的差集
        """
        al = set(java_list)
        ol = set(json_list)
        if al == ol:
            return True
        # elements in java_list but not in json_list
        al_diff = list(al.difference(ol))
        # elements in json_list but not in java_list
        ol_diff = list(ol.difference(al))
        return al_diff, ol_diff

    def get_same_list(self, java_list, json_list):
        """
        :return:对比两个list，返回两个list的交集
        """
        al = set(java_list)
        ol = set(json_list)
        # elements in java_list & json_list
        same = list(al.intersection(ol))
        return same

    def get_del_white_list(self, java_list, json_list):
        """
        :return:对比两个list，且从差集中剔除白名单字段
        先去除白名单，再把不两差的差集找出来
        """
        al_diff = WhiteList().discard_white_list(java_list)
        ol_diff = WhiteList().discard_white_list(json_list)
        al_set = set(al_diff)
        ol_set = set(ol_diff)
        if al_set == ol_set:
            return True
        else:
            java_diff, json_diff = self.get_diff_list(al_diff, ol_diff)
            return java_diff, json_diff
