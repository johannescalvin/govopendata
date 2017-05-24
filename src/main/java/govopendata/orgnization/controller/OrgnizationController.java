package govopendata.orgnization.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orgnization")
public class OrgnizationController {
	
	public OrgnizationController(){
		//System.exit(1);
		//org.springframework.stereotype.Controller co;
		System.out.println("init OrgnizationController ... ");
	}
	
	@RequestMapping(value="/create")
	@ResponseBody
	public Map<String,Object> create(
			@RequestParam(name="full_name_cn",required=true) String fullNameCn,
			@RequestParam(name="full_name_en",required=true) String shortNameCn,
			@RequestParam(name="short_name_cn",required=true) String fullNameEn,
			@RequestParam(name="short_name_en",required=true) String shortNameEn
			/* @RequestParam(name="altNames") List<OrgName> namesList */
			){
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		return resultlMap;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	public Map<String,Object> update(	
			@RequestParam(name="org_id",required=true) String orgId){
			Map<String,Object>  resultlMap = new HashMap<String,Object>();
			return resultlMap;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public Map<String,Object> delete(@RequestParam(name="org_id",required=true) String orgId){
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		return resultlMap;
	}
	
}
