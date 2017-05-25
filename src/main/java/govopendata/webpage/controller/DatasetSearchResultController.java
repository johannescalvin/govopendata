package govopendata.webpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dataset/searchresult/display")
public class DatasetSearchResultController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getSearchResultPage(){
		return "dataset/search_result";
	}
}
