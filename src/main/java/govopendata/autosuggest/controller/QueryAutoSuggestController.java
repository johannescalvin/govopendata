package govopendata.autosuggest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.utils.PageBar;

@Controller
@RequestMapping("/autosuggest/query")
public class QueryAutoSuggestController {
	// 用户检索时的动态查询提示
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public PageBar<Object> autoSuggest(@RequestParam(name="search_query",required=true) String searchQuery){
		return new PageBar<Object>();
	}
}


