#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/29
# @Author   :chenaimei
# @Function :简述当前文件

import xlsxwriter

workbook = xlsxwriter.Workbook('aaa.xlsx')
worksheet = workbook.add_worksheet("字段对比结果")
# 设置列宽与行高
worksheet.set_column('A:C', 36.0)
# 写入表头
worksheet.write(0, 0, "仅JAVA端有：")
worksheet.write(0, 1, "仅WEB端有：")
worksheet.write(0, 2, "JAVA端与WEB端均包含：")
