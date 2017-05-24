package govopendata.thesaurus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import govopendata.thesaurus.entity.SubjectWordRelation;
import govopendata.utils.ResultStatus;

@Controller
@RequestMapping("/subjectword/relation")
public class SubjectwordRelationController {
	@RequestMapping("/create")
	public ResultStatus create(
			@RequestParam(name="src_subject_word_id",required=true) Long srcSubjectWordId,
			@RequestParam(name="dest_subject_word_id",required=true) long destSubjectWordId,
			@RequestParam(name="relation_type",required=true) SubjectWordRelation relation){
		return new ResultStatus();
	}
	
	@RequestMapping("/create")
	public ResultStatus delete(){
		return new ResultStatus();
	}
}
