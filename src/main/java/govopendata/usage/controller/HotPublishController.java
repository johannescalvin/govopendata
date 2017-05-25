package govopendata.usage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import govopendata.orgnization.entity.Orgnization;
import govopendata.utils.PageBar;

@Controller
@RequestMapping("/usage/publisher")
public class HotPublishController {
	//获取最热出版机构
	@RequestMapping(value="/hotest",method=RequestMethod.GET)
	public PageBar<Orgnization> getHotestPublisher(){
		return new PageBar<Orgnization>();
	}
}
