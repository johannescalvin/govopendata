API
创建机构

	/api/orgnization/create

参数

	{
		full_name_cn:string, 	/**/
		short_name_cn:string,	/**/
		full_name_en:string,	/**/
		short_name_en:string,	/**/
		org_type:string,		/**/
		landingPage:string		/**/
		

	}

创建机构间关系

	/api/orgnization/relation/create

参数

	{
		src_org_id:long,		/**/
		dest_org_id:long,		/**/
		relation_type:string	/**/
	}

删除机构间关系

	/api/orgnization/relation/delete

参数

	{
		src_org_id:long,		/**/
		dest_org_id:long,		/**/
		relation_type:string	/**/
	}

创建机构地址

	/api/orgnization/location/create

参数

	{
		org_id:long,			 /**/
		longitude：double,		/*经度*/
		latitude:double,		/*纬度*/
		address:string			/**/
	}

更新机构地址

	/api/orgnization/location/update

参数

	{
		org_id:long,			 /**/
		longitude：double,		/*经度*/
		latitude:double,		/*纬度*/
		address:string			/**/
	}

机构搜粟
根据ID获取机构

	/api/orgnization/search/getbyid

参数

	{
		org_id：long
	}
	

根据名称精确获取机构

	/api/orgnization/search/getByName

参数

	{
		name：string
	}

根据中文名称检索机构

	/api/orgnization/search/searchByCnName

参数

	{
		name_cn：string
	}

根据英文名称检索机构

	/api/orgnization/search/searchByCnName

参数

	{
		name_en：string
	}

根据所有名称字段名称检索机构

	/api/orgnization/search/searchByNames

参数

	{
		name：string
	}

根据经纬度位置检索附近的机构

	/orgnization/search/searchByLocation

参数

	{
		longitude：double,		/*经度*/
		latitude:double,		/*纬度*/
		distance:double	/*与经纬度指定位置的最大距离*/
	}

根据地址名称检索机构

	/api/orgnization/search/searchByAddress

参数

	{
		address:string
	}

根据机构间的关系查找相关机构

	/api/orgnization/search/searchByLocation

参数

	{
		src_org_id：long,/*起始结点*/
		relation_type:string,/*关系类型名称*/
		step_limit:int /*关系路径最大长度*/
	}

Subject Word API
创建主题词

	/api/subjectword/create

参数

	{
		uri:string,
		name:string
	}

更新主题词的属性

	/api/subjectword/update

参数

	{
		subject_word_id:long
	}

删除主题词 （慎用）

	/api/subjectword/delete

参数

	{
		subject_word_id:string
	}

创建词间关系

	/api/subjectword/relation/create

参数

	{
		src_subject_word_id:long,		/**/
		dest_subject_word_id:long,		/**/
		relation_type:string			/**/
	}

删除词间关系

	/api/subjectword/relation/delete

参数

	{
		src_subject_word_id:long,		/**/
		dest_subject_word_id:long,		/**/
		relation_type:string			/**/
	}
	

获得词间关系列表

	/api/subjectword/relationtypelist

无参数 只能使用GET方法
Subject Word Search API
根据ID直接获取主题词

	/api/subjectword/search/getById

参数

	{
		subject_word_id : long
	}

根据指定平台的URI获取主题词

	/subjectword/search/getByURI

参数

	{
		platform : string,
		uri:string
	}

根据字面值检索主题词

	/api/subjectword/search/searchByLiteral

参数

	{
		word_literal:string
	}

根据词间关系进行检索

	/subjectword/search/searchBySubjectwordRelation

参数

	{
		src_subject_word_id:long,		/*主题词ID*/
		subject_word_relation:string,	/*词间关系类型*/
		steps_limit:int,					/*关系路径最大长度*/
		intermediate result_included:boolean	/*是否包含中间结果*/
	}

按照词间关系路径进行搜索

	/api/subjectword/search/searchByRelationPath

	{
		src_subject_word_id:long,		/*主题词ID*/
		intermediate result_included:boolean	/*是否包含中间结果*/
		...
	}

Data Set Search API
根据ID获得数据集

	/api/dataset/search/getById

参数

	{
		dataset_id:long	/**数据集ID*/
	}

根据数据集名称进行检索

	/api/dataset/search/searchByName

参数

	{
		dataset_name:string		/*数据集名称*/
	}

根据主题词检索

	/api/dataset/search/searchBySubjectWords

参数

	{
		dataset_subject_words:string	/**数据集主题词*/
	}

根据关键词检索

	/api/dataset/search/searchByKeyWords

参数

	{
		dataset_key_words:string		/*数据集关键词*/
	}

根据数据集描述检索

	/api/dataset/search/searchByDescription

参数

	{
		dataset_description：string		/*数据集描述*/
	}

根据出版者名称检索

	/api/dataset/search/searchByPublisherName

参数

	{
		dataset_publisher_name:string		/**出版者名称*/
	}

数据集浏览
根据数据ID浏览

	/api/dataset/view/byId

参数

	{
		dataset_id:long
	}

根据出版者ID进行浏览

	/api/dataset/view/byPublisherId

参数

	{
		dataset_publisher_id:long
	}

根据出版者名称进行浏览

	/api/dataset/view/byPublisherName

参数

	{
		dataset_publisher_Name:string
	}

根据出版者类型进行浏览

	/api/dataset/view/byPublisherType

参数

	{
		dataset_publisher_type:string	/*数据集出版机构类型*/
	}

根据主题词ID进行浏览

	/api/dataset/view/bySubjectWordId

参数

	{
		dataset_subject_word_id:long
	}

根据主题词URI进行浏览

	/api/dataset/view/byPublisherId	/*主题词ID*/

参数

	{
		dataset_subject_word_uri:string	/*主题词URI*/
	}	

根据主题词字面值进行浏览

	/api/dataset/view/bySubjectWordLiteral

参数

	{
		dataset_subject_word_literal:string
	}

根据关键词字面值进行浏览

	/api/dataset/view/byKeywordLiteral

参数

	{
		dataset_keyword_literal:string /*关键词字面值*/
	}

根据数据集标题进行浏览

	/api/dataset/view/byTitle

参数

	{
		dataset_title:string	/*数据集标题*/
	}

根据数据集主题分类进行浏览

	/api/dataset/view/byCategory

参数

	{
		dataset_category:string	/*数据集主题分类*/
	}

根据数据集发布者的区位进行浏览

	/api/dataset/view/byPublisherLocation

参数

	{
		dataset_publisher_location: {
			province:string,
			city:string,
			county:string,
			town:string
		}
	}

根据数据集发布者的地址范围进行浏览

	/api/dataset/view/byPublisherAddress

参数

	{
		dataset_publisher_address: string,	/**地址信息*/
		distance_limit:double					/*最大距离限制*/
	}

辅助发现 API
获取最热主题词

	/api/usage/subjectword/hotest

获取最热关键词

	/api/usage/keyword/hotest

最热数据集出版机构

	/api/usage/publisher/hotest

最热检索式

	/api/usage/searchquery/hotest

检索式自动提示

	/api/autosuggest/query

参数

	{
		search_query:string
	}

组织机构自动提示

	/api/autosuggest/orgnization

参数

	{
		org_name:string	/*机构名称*/
	}

Site Map
首页

数据集
创建页面

	/dataset/create

展示页面

	/dataset/display

检索界面

	/dataset/searchpage

检索结果展示页面

	/dataset/searchresult/display

主题词
展示页面

	/subject/display

机构
展示页面

	/orgnization/display

操作中心

	/orgnization/center
