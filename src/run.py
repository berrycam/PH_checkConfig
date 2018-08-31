#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time     :2018/8/27
# @Author   :chenaimei
# @Function :执行检查入口

import logging
from src.main.readConfig import ReadConfig
from src.main.checkConfig import CheckConfig

if __name__ == '__main__':
    log_path = ReadConfig().get_file_path("log_path")
    logging.basicConfig(level=logging.INFO,
                        format='%(asctime)s-%(levelname)s: %(message)s',
                        filename=log_path,
                        filemode='w')
    a = CheckConfig()
    a.check_formName()
    a.check_fieldName()
    print("配置比对工作完成！")

