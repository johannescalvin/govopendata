package govopendata.orgnization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.utils.ResultStatus;

@Controller
@RequestMapping("/orgnization/location")
public class OrgLocationController {
	@RequestMapping("/create")
	@ResponseBody
	public ResultStatus create(	
			@RequestParam(name="org_id",required=true) Long orgId,			//机构ID
			@RequestParam(name="address",required=true) String address,		//总部详细地址
			@RequestParam(name="longitude",required=true)  Double longitude,	//经度
			@RequestParam(name="latitude",required=true) Double latitude	//纬度
			){
		
		ResultStatus status = new ResultStatus();
		return status;
	}
	@RequestMapping("/update")
	@ResponseBody
	public ResultStatus update(	
			@RequestParam(name="org_id",required=true) Long orgId,			//机构ID
			@RequestParam(name="address",required=true) String address,		//总部详细地址
			@RequestParam(name="longitude",required=true)  Double longitude,	//经度
			@RequestParam(name="latitude",required=true) Double latitude	//纬度
			){
		
		ResultStatus status = new ResultStatus();
		return status;
	}
	
	//唯一地址 只允许创建和更新  不允许删除
	
	
}
