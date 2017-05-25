package govopendata.usage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.utils.PageBar;
import govopendata.utils.SearchQueryVO;
@Controller
@RequestMapping("/usage/searchquery")
public class HotQueryController {
	@RequestMapping("/hotest")
	@ResponseBody
	public PageBar<SearchQueryVO> getHotest(){
		return new PageBar<SearchQueryVO>();
	}
}
