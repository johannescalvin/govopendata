package govopendata.dataset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import govopendata.utils.ResultStatus;

@Controller
@RequestMapping("/api/dataset")
public class DatasetController {
	@RequestMapping("/upload")
	public ResultStatus create(){
		return new ResultStatus();
	}
}
