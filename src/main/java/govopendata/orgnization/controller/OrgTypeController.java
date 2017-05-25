package govopendata.orgnization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/orgnization/orgtype")
public class OrgTypeController {
	@RequestMapping("/typelist")
	@ResponseBody
	public void getOrgTypeList(){
		
	}
}
