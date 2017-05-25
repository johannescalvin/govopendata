package govopendata.dataset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.orgnization.entity.Location;
import govopendata.orgnization.entity.OrgType;
import govopendata.utils.PageBar;

@Controller
@RequestMapping("/dataset/view")
public class DatasetViewController {
	//按数据集ID
	@RequestMapping("/byId")
	@ResponseBody
	public PageBar<Object> viewDatasetById(
		@RequestParam(name="dataset_id",required=true) long datasetId	/**数据集ID*/
	){
		return new PageBar<Object>();
	}
	//按出版者ID
	@RequestMapping("/byPublisherId")
	@ResponseBody
	public PageBar<Object> viewByPublisherId(
		@RequestParam(name="dataset_publisher_id",required=true) long publisherId	/**数据集发布者ID*/
	){
		return new PageBar<Object>();
	}
	//按出版者名称
	@RequestMapping("/byPublisherName")
	@ResponseBody
	public PageBar<Object> viewDatasetByPublisherName(
		@RequestParam(name="dataset_publisher_name",required=true) String publisherName	/**发布机构名称*/
	){
		return new PageBar<Object>();
	}
	
	//按出版者机构性质
	//按出版者名称
	@RequestMapping("/byPublisherType")
	@ResponseBody
	public PageBar<Object> viewDatasetByPublisherType(
		@RequestParam(name="dataset_publisher_type",required=true) OrgType orgType	/**发布机构类型*/
	){
		return new PageBar<Object>();
	}
	//按主题词ID
	@RequestMapping("/bySubjectWordId")
	@ResponseBody
	public PageBar<Object> viewDatasetBySubjectWordId(
		@RequestParam(name="dataset_subject_word_id",required=true) long wordId	/**主题词ID*/
	){
		return new PageBar<Object>();
	}
	
	//按主词题URI
	@RequestMapping("/bySubjectWordURI")
	@ResponseBody
	public PageBar<Object> viewDatasetBySubjectWordURI(
		@RequestParam(name="dataset_subject_word_uri",required=true) String wordURI	/**主题词URI*/
	){
		return new PageBar<Object>();
	}
	//按主题词字面值
	@RequestMapping("/bySubjectWordLiteral")
	@ResponseBody
	public PageBar<Object> viewDatasetBySubjectWordLiteral(
		@RequestParam(name="dataset_subject_word_literal",required=true) String wordLiteral	/**主题词字面值*/
	){
		return new PageBar<Object>();
	}
	
	//按关键词
	@RequestMapping("/byKeywordLiteral")
	@ResponseBody
	public PageBar<Object> viewDatasetByKeywordLiteral(
		@RequestParam(name="dataset_keyword_literal",required=true) String wordLiteral	/**数据集关键词*/
	){
		return new PageBar<Object>();
	}
	//按标题
	@RequestMapping("/byTitle")
	@ResponseBody
	public PageBar<Object> viewDatasetByTitle(
		@RequestParam(name="dataset_title",required=true) String title	/**数据集标题*/
	){
		return new PageBar<Object>();
	}
	//按数据集的主题分类
	@RequestMapping("/byCategory")
	@ResponseBody
	public PageBar<Object> viewDatasetByCategory(
			@RequestParam(name="dataset_category",required=true) String category	/**分类*/
		){
		return new PageBar<Object>();
	}
	
	//按Location
	//按地域-省份
	//按地域-城市
	//按地域-区县
	@RequestMapping("/byPublisherLocation")
	@ResponseBody
	public PageBar<Object> viewDatasetByPublisherLocation(
			@RequestParam(name="dataset_publisher_location",required=true) Location publisherLocation	/**出版者的区位信息*/
		){
		return new PageBar<Object>();
	}
	
	//按某地址范围内区域
	//TODO 	地址定位获取失败或者没有查到数据集 将自动转为按机构地址搜索
	@RequestMapping("/byPublisherAddress")
	@ResponseBody
	public PageBar<Object> viewDatasetByPublisherAddress(
			@RequestParam(name="dataset_publisher_address",required=true) String publisherAddress,	/**出版者的地址*/
			@RequestParam(name="distance_limit",required=false) double distance			/**最大距离范围*/
		){
		return new PageBar<Object>();
	}
	
	
	
}
