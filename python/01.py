#!/usr/bin/python3
import  requests
stockList=[]
crawlSite="http://hq.sinajs.cn/list=s_sh000001"
res = requests.get(crawlSite)
data = res.content
stockList = data.decode('gb2312').split(',')
print(stockList)