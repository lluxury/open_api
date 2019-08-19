#!/usr/bin/env python
# #coding=utf-8
import alibabacloud
from aliyunsdkcore.client import AcsClient
# from aliyunsdkcore.acs_exception.exceptions import ClientException
# from aliyunsdkcore.acs_exception.exceptions import ServerException
# from aliyunsdkrds.request.v20140815.DescribeBackupsRequest import DescribeBackupsRequest
from aliyunsdkrds.request.v20140815.DescribeDBInstancesRequest import DescribeDBInstancesRequest
import sys
# sys.path.append("..")
from config.config import *

# ecs = alibabacloud.get_resource(
#     'ecs',
#     access_key_id=ACCESS_KEY_ID,
#     # access_key_id=config.ACCESS_KEY_ID, 后面研究下是怎么写的
#     access_key_secret=ACCESS_KEY_SECRET,
#     region_id="cn-hangzhou",
# )
#
# for instance in ecs.instances.all():
#     print(instance.instance_id)


client  = AcsClient(ACCESS_KEY_ID,ACCESS_KEY_SECRET,"cn-hangzhou")

request = DescribeDBInstancesRequest()
request.set_accept_format('json')

response = client.do_action_with_exception(request)
print(response)
# print(str(response, encoding='utf-8'))