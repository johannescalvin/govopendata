# govopendata
This is an open source project of government open data, which is implemented in java , for sake of Exensiability ,Performance and Flexiability ...(instead of ckan)

# API
### 创建机构
```
	/orgnization/create
```
####	参数
```
	{
		full_name_cn:string, 	/**/
		short_name_cn:string,	/**/
		full_name_en:string,	/**/
		short_name_en:string,	/**/
		org_type:string,		/**/
		landingPage:string		/**/
		

	}
```
###	创建机构间关系
```
	/orgnization/relation/create
```
####	参数
```
	{
		src_org_id:long,		/**/
		dest_org_id:long,		/**/
		relation_type:string	/**/
	}
```
###	删除机构间关系
```
	/orgnization/relation/delete
```
####	参数
```
	{
		src_org_id:long,		/**/
		dest_org_id:long,		/**/
		relation_type:string	/**/
	}
```


###	创建机构地址
```
	/orgnization/location/create
```
####	参数
```
	{
		org_id:long,			 /**/
		longitude：double,		/*经度*/
		latitude:double,		/*纬度*/
		address:string			/**/
	}
```

###	更新机构地址
```
	/orgnization/location/update
```
####	参数
```
	{
		org_id:long,			 /**/
		longitude：double,		/*经度*/
		latitude:double,		/*纬度*/
		address:string			/**/
	}
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

##	Subject Word API
### 创建主题词
```
	/subjectword/create
```
#### 参数
```
	{
		uri:string,
		name:string
	}
```
### 更新主题词的属性
```
	/subjectword/update
```
####	参数
```
	{
		subject_word_id:long
	}
```
###	删除主题词 （慎用）
```
	/subjectword/delete
```
####	参数
```
	{
		subject_word_id:string
	}
```
###	创建词间关系
```
	/subjectword/relation/create
```
####	参数
```
	{
		src_subject_word_id:long,		/**/
		dest_subject_word_id:long,		/**/
		relation_type:string			/**/
	}
```	
###	删除词间关系
```
	/subjectword/relation/delete
```
####	参数
```
	{
		src_subject_word_id:long,		/**/
		dest_subject_word_id:long,		/**/
		relation_type:string			/**/
	}
	
```
### 获得词间关系列表
```
	/subjectword/relationtypelist
```
### 无参数 只能使用*GET*方法
## Subject Word Search API
###	根据ID直接获取主题词
```
	/subjectword/search/getById
```
####	参数
```
	{
		subject_word_id : long
	}
```
###	根据指定平台的URI获取主题词
```
	/subjectword/search/getByURI
```
####	参数
```
	{
		platform : string,
		uri:string
	}
```
### 根据字面值检索主题词
```
	/subjectword/search/searchByLiteral
```
####	参数
```
	{
		word_literal:string
	}
```
### 根据词间关系进行检索
```
	/subjectword/search/searchBySubjectwordRelation
```
####	参数
```
	{
		src_subject_word_id:long,		/*主题词ID*/
		subject_word_relation:string,	/*词间关系类型*/
		steps_limit:int,					/*关系路径最大长度*/
		intermediate result_included:boolean	/*是否包含中间结果*/
	}
```
### 按照词间关系路径进行搜索
```
	/subjectword/search/searchByRelationPath
```
```
	{
		src_subject_word_id:long,		/*主题词ID*/
		intermediate result_included:boolean	/*是否包含中间结果*/
		...
	}
```

## Data Set Search API
###	根据ID获得数据集
```
	/dataset/search/getById
```
####	参数
```
	{
		dataset_id:long	/**数据集ID*/
	}
```
###	根据数据集名称进行检索
```
	/dataset/search/searchByName
```
####	参数
```
	{
		dataset_name:string		/*数据集名称*/
	}
```
###	根据主题词语
```
	/dataset/search/searchBySubjectWords
```
####	参数
```
	{
		dataset_subject_words:string	/**数据集主题词*/
	}
```

###	根据关键词检索
```
	/dataset/search/searchByKeyWords
```
####	参数
```
	{
		dataset_key_words:string		/*数据集关键词*/
	}
```
###	根据数据集描述检索
```
	/dataset/search/searchByDescription
```
####	参数
```
	{
		dataset_description：string		/*数据集描述*/
	}
```

### 根据出版者名称检索	
```
	/dataset/search/searchByPublisherName
```
####	参数
```
	{
		dataset_publisher_name:string		/**出版者名称*/
	}
