package govopendata.thesaurus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.thesaurus.entity.SubjectWordPlatform;
import govopendata.thesaurus.entity.SubjectWordRelation;
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
	
	@RequestMapping("/getByURI")
	@ResponseBody
	public  PageBar<SubjectWord> searchByURI(
			@RequestParam(name="platform",required=true) SubjectWordPlatform platform,	/*主题词平台*/
			@RequestParam(name="uri",required=true) String uri 				/*主题词在平台的URI*/
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
	
	@RequestMapping("/searchBySubjectwordRelation")
	@ResponseBody
	public PageBar<SubjectWord> searchBySubjectwordRelation(
			@RequestParam(name="src_subject_word_id",required=true) long src_subject_word_id,
			@RequestParam(name="subject_word_relation",required=true) SubjectWordRelation relation,
			@RequestParam(name="steps_limit",required=true) int steps_limit,
			@RequestParam(name="intermediate result_included",required=false)	boolean included
			){
		return new PageBar<SubjectWord>();
	}
	@RequestMapping("/searchByRelationPath")
	@ResponseBody
	public PageBar<SubjectWord> searchByRelationPath(
			@RequestParam(name="src_subject_word_id",required=true) long src_subject_word_id,
			@RequestParam(name="intermediate result_included",required=false)	boolean included
			){
		return new PageBar<SubjectWord>();
	}
			
	
}
