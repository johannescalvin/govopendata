package govopendata.dataset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.utils.PageBar;

@Controller
@RequestMapping("/dataset/search")
public class DatasetSearchController {
	@RequestMapping("/getById")
	@ResponseBody
	public Object getById(){
		return new Object();
	}
	
	@RequestMapping("/searchByName")
	@ResponseBody
	public PageBar<Object> searchByName(){
		return new PageBar<Object>();
	}
	
	@RequestMapping("/searchBySubjectWords")
	@ResponseBody
	public PageBar<Object> searchSubjectWords(){
		return new PageBar<Object>();
	}
	
	@RequestMapping("/searchByKeyWords")
	@ResponseBody
	public PageBar<Object> searchByKeyWords(){
		return new PageBar<Object>();
	}
	
	@RequestMapping("/searchByDescription")
	@ResponseBody
	public PageBar<Object> searchByDescription(){
		return new PageBar<Object>();
	}

	
}
