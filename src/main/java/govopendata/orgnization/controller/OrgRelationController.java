package govopendata.orgnization.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.orgnization.entity.OrgRelationType;
import govopendata.orgnization.service.OrgRelationService;

@Controller
@RequestMapping("/orgnization/relation")
public class OrgRelationController {
	@Resource
	OrgRelationService orgRelationService;
	
	@RequestMapping(value="/create")
	@ResponseBody
	public Map<String,Object> update(	
		@RequestParam(name="src_org_id",required=true) Long sourceOrgId,
		@RequestParam(name="dest_org_id",required=true)  Long destOrgId ,
		@RequestParam(name="relation_type",required=true) OrgRelationType relationType){
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		
		resultlMap.put("info", "ok");
		return resultlMap;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public Map<String,Object> delete(	
			@RequestParam(name="src_org_id",required=true) String sourceOrgId,
			@RequestParam(name="test_org_id",required=true) String destOrgId ,
			@RequestParam(name="relation_type",required=true) OrgRelationType relationType
			){
		
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		return resultlMap;
	}
	
	@RequestMapping(value="/relationtypelist")
	@ResponseBody
	public List<OrgRelationType> getRelationTypeList(){
		List<OrgRelationType> list = new ArrayList<OrgRelationType>();
		for(OrgRelationType type : OrgRelationType.values()){
			list.add(type);
		}
		return list;
	}
}
