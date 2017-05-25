package govopendata.dataset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.utils.PageBar;

@Controller
@RequestMapping("/dataset/search")
public class DatasetSearchController {
	@RequestMapping("/getById")
	@ResponseBody
	public Object getById(
			@RequestParam(name="dataset_id",required=true) long datasetId	/**数据集ID*/
			){
		return new Object();
	}
	
	@RequestMapping("/searchByName")
	@ResponseBody
	public PageBar<Object> searchByName(
			@RequestParam(name="dataset_name",required=true) String datasetName	/**数据集名称*/
			){
		return new PageBar<Object>();
	}
	
	@RequestMapping("/searchBySubjectWords")
	@ResponseBody
	public PageBar<Object> searchSubjectWords(
			@RequestParam(name="dataset_subject_words",required=true) String datasetSubjectWords	/**数据集主题词*/
			){
		return new PageBar<Object>();
	}
	
	@RequestMapping("/searchByKeyWords")
	@ResponseBody
	public PageBar<Object> searchByKeyWords(
			@RequestParam(name="dataset_key_words",required=true) String datasetKeyWords	/**数据集关键词*/
			){
		return new PageBar<Object>();
	}
	
	@RequestMapping("/searchByDescription")
	@ResponseBody
	public PageBar<Object> searchByDescription(
			@RequestParam(name="dataset_description",required=true) String datasetDescription	/**数据集描述*/
			){
		return new PageBar<Object>();
	}
	@RequestMapping("/searchByPublisherName")
	@ResponseBody
	public PageBar<Object> searchByPublisherName(
			@RequestParam(name="dataset_publisher_name",required=true) String publisherName /**数据集出版者名称*/
			){
		return new PageBar<Object>();
	}
	
	
}
