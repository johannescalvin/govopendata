# govopendata
This is an open source project of government open data, which is implemented in java , for sake of Exensiability ,Performance and Flexiability ...(instead of ckan)

# API
## 创建机构
```
	../orgnization/create?full_name_cn=武汉大学&full_name_en=WHU&short_name_cn=武大 \
		&short_name_en=WHU&org_type=Xingzheng&landingPage
```
##	创建机构间关系
```
	../orgnization/relation/create?src_org_id=1&test_org_id=2&relation_type=ChangedFrom
```

##	删除机构间关系
```
	../orgnization/relation/delete?src_org_id=1&test_org_id=2&relation_type=ChangedFrom
```


##创建机构地址
```
	../orgnization/location/create?org_id=1&address=湖北省武汉市武昌区武汉大学&longitude=110.2&latitude=29.89
```

##更新机构地址
```
	../orgnization/location/update?org_id=1&address=湖北省武汉市武昌区武汉大学&longitude=110.2&latitude=29.89
```

## 机构搜粟

##根据ID获取机构
```
	/orgnization/search/getbyid
```
###	参数
```javascript
	{
		org_id：int
	}
	
```