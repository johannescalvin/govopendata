package govopendata.thesaurus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import govopendata.utils.ResultStatus;

@Controller
@RequestMapping("/api/subjectword")
public class SubjectwordController {
	@RequestMapping("/create")
	public ResultStatus create(){
		return new ResultStatus();
	}
	
	@RequestMapping("/update")
	public ResultStatus update(){
		return new ResultStatus();
	}
	
	@RequestMapping("/delete")
	public ResultStatus delete(){
		return new ResultStatus();
	}
}
