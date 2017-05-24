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


##	创建机构地址
```
	../orgnization/location/create?org_id=1&address=湖北省武汉市武昌区武汉大学&longitude=110.2&latitude=29.89
```

##	更新机构地址
```
	../orgnization/location/update?org_id=1&address=湖北省武汉市武昌区武汉大学&longitude=110.2&latitude=29.89
```

## 机构搜粟

###	根据ID获取机构
```
	/orgnization/search/getbyid
```
####	参数
```javascript
	{
		org_id：long
	}
	
```

###	根据名称*精确*获取机构
```
	/orgnization/search/getByName
```
####	参数
```javascript
	{
		name：string
	}
```
###	根据中文名称*检索*机构
```
	/orgnization/search/searchByCnName
```
####	参数
```javascript
	{
		name_cn：string
	}
```

###	根据英文名称*检索*机构
```
	/orgnization/search/searchByCnName
```
####	参数
```javascript
	{
		name_en：string
	}
```

###	根据*所有*名称字段名称*检索*机构
```
	/orgnization/search/searchByNames
```
####	参数
```javascript
	{
		name：string
	}
```
###	根据经纬度位置检索附近的机构
```
	/orgnization/search/searchByLocation
```
####	参数
```javascript
	{
		longitude：double,		/*经度*/
		latitude:double,		/*纬度*/
		distance:double	/*与经纬度指定位置的最大距离*/
	}
```

###	根据地址名称检索机构
```
	/orgnization/search/searchByAddress
```
####	参数
```javascript
	{
		address:string
	}
```


###	根据机构间的关系查找相关机构
```
	/orgnization/search/searchByLocation
```
####	参数
```javascript
	{
		src_org_id：long,/*起始结点*/
		relation_type:string,/*关系类型名称*/
		step_limit:int /*关系路径最大长度*/
	}
```