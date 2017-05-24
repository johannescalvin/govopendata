package govopendata.orgnization.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.orgnization.entity.OrgRelationType;

@Controller
@RequestMapping("/orgnization/relation")
public class OrgRelationController {
	
	@RequestMapping(value="/create")
	@ResponseBody
	public Map<String,Object> update(	
		@RequestParam(name="src_org_id",required=true) String sourceOrgId,
		@RequestParam(name="test_org_id",required=true) String destOrgId ){
		Map<String,Object>  resultlMap = new HashMap<String,Object>();
		
		resultlMap.put("info", "ok");
		return resultlMap;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public Map<String,Object> delete(	
		@RequestParam(name="org_id",required=true) String orgId){
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
