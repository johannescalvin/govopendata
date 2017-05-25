package govopendata.webpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/orgnization/display")
public class OrgnizationDisplayController {
	@RequestMapping(method= RequestMethod.GET)
	public String getPage(){
		return "orgnization/org_display";
		
	}
}
