package govopendata.webpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**机构用户中心*/
@Controller
@RequestMapping("/orgnization/center")
//TODO 需要权限控制
public class OrgnizationCenterController {
		@RequestMapping(method=RequestMethod.GET)
	   public String getPage(){
		   return "orgnization/org_center";
	   }
}
