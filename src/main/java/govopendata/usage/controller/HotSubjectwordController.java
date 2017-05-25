package govopendata.usage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.thesaurus.entity.SubjectWord;
import govopendata.utils.PageBar;

@Controller
@RequestMapping("/usage/subjectword")
public class HotSubjectwordController {
	//获取最热主题词
	@RequestMapping(value="/hotest",method=RequestMethod.GET)
	@ResponseBody
	public PageBar<SubjectWord> getHotestSubjectWord(){
		return new  PageBar<SubjectWord>();
	}
}
