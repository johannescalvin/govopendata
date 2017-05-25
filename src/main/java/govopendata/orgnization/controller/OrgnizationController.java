package govopendata.orgnization.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.orgnization.entity.OrgType;
import govopendata.orgnization.service.OrgnizationBasicInfoService;

@Controller
@RequestMapping("/api/orgnization")
public class OrgnizationController {
	@Resource
	OrgnizationBasicInfoService orgnizationBasicInfoService;
	
	
	@RequestMapping(value="/create")
	@ResponseBody
	public Map<String,Object> create(
			@RequestParam(name="full_name_cn",required=true) String fullNameCn, //中文全称呼
			@RequestParam(name="full_name_en",required=true) String shortNameCn,	//中文简称
			@RequestParam(name="short_name_cn",required=true) String fullNameEn,	//英文全称
			@RequestParam(name="short_name_en",required=true) String shortNameEn, //英文简称
			@RequestParam(name="org_type",required=true) OrgType orgType,	//机构类型
			@RequestParam(name="landingPage",required=true) String landingPage	//机构的主页URL地址
			/* @RequestParam(name="altNames") List<OrgName> namesList */
			){
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		resultlMap.put("info", "ok");
		return resultlMap;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	public Map<String,Object> update(	
				@RequestParam(name="org_id",required=true) String orgId,		//机构ID
				@RequestParam(name="full_name_cn",required=true) String fullNameCn, //中文全称呼
				@RequestParam(name="full_name_en",required=true) String shortNameCn,	//中文简称
				@RequestParam(name="short_name_cn",required=true) String fullNameEn,	//英文全称
				@RequestParam(name="short_name_en",required=true) String shortNameEn, //英文简称
				@RequestParam(name="org_type",required=true) OrgType orgType,	//机构类型
				@RequestParam(name="landingPage",required=true) String landingPage	//机构的主页URL地址
			){
		
			Map<String,Object>  resultlMap = new HashMap<String,Object>();
			resultlMap.put("info", "ok");
			 
			return resultlMap;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public Map<String,Object> delete(@RequestParam(name="org_id",required=true) String orgId){
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		resultlMap.put("info", "ok");
		return resultlMap;
	}
	
}
