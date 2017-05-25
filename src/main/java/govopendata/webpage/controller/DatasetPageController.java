package govopendata.webpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dataset")
public class DatasetPageController {
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String getCreatePage(){
		return "dataset/dataset_create";
		
	}
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String getDisplayPage(){
		return "dataset/dataset_display";
		
	}
}
