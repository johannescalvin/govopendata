package govopendata.autosuggest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.orgnization.entity.Orgnization;
import govopendata.utils.PageBar;

@Controller
@RequestMapping("/autosuggest/orgnization")
public class OrgnizationAutoSuggestController {
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public PageBar<Orgnization>  autoSuggest(@RequestParam(name="org_name",required=true) String orgName){
		return new PageBar<Orgnization>();
	}
}
