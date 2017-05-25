package govopendata.usage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import govopendata.utils.PageBar;

@Controller
@RequestMapping("/usage/keyword")
public class HotKeywordController {
	//获取最热关键词
	@RequestMapping("/hotest")
	public PageBar<String> getHotestKeywords(){
		return new PageBar<String>();
	}
}
