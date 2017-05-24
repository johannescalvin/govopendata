package govopendata.thesaurus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.utils.PageBar;

@Controller
@RequestMapping("/subjectword/search")
public class SubjectwordSearchController<SubjectWord> {
	@ResponseBody
	@RequestMapping("/getById")
	public  PageBar<SubjectWord> getById(
			@RequestParam(name="subject_word_id",required=true) long subjectWordId
			){
		return new PageBar<SubjectWord>();
		
	}

	@RequestMapping("/searchByLiteral")
	@ResponseBody
	public  PageBar<SubjectWord> searchByLiteral(
			@RequestParam(name="word_literal",required=true) String wordLiteral
			){
		return new PageBar<SubjectWord>();
		
	}
}
