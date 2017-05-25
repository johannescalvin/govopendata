package govopendata.orgnization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import govopendata.orgnization.entity.OrgRelationType;
import govopendata.orgnization.entity.Orgnization;
import govopendata.utils.PageBar;

@Controller
@RequestMapping("/api/orgnization/search")
public class OrgSearchController {
	@RequestMapping("/getbyid")
	@ResponseBody
	public  Orgnization getById(@RequestParam(name="org_id",required=true) Long orgId){
		return new Orgnization();
	}
	
	@RequestMapping("/getByName")
	@ResponseBody
	public PageBar<Orgnization> getByName(@RequestParam(name="name",required=true) String cnName){
		return  new PageBar<Orgnization>();
	}
	
	@RequestMapping("/searchByCnName")
	@ResponseBody
	public PageBar<Orgnization> searchByCnName(@RequestParam(name="name_cn",required=true) String cnName){
		return  new PageBar<Orgnization>();
	}
	
	@RequestMapping("/searchByEnName")
	@ResponseBody
	public PageBar<Orgnization> searchByEnName(@RequestParam(name="name_en",required=true) String enName){
		return  new PageBar<Orgnization>();
	}

	@RequestMapping("/searchByNames")
	@ResponseBody
	public PageBar<Orgnization> searchByNames(@RequestParam(name="name",required=true) String cnName){
		return  new PageBar<Orgnization>();
	}
	
	@RequestMapping("/searchByAddress")
	@ResponseBody
	public PageBar<Orgnization> searchAddress(@RequestParam(name="address",required=true) String address){
		return  new PageBar<Orgnization>();
	}
	
	/**查找某经纬度范围内的机构*/
	//TODO 使用 MongoDB 存储 实现
	@RequestMapping("/searchByLocation")
	@ResponseBody
	public PageBar<Orgnization> searchByNames(
			@RequestParam(name="longitude",required=true)  Double longitude,	//经度
			@RequestParam(name="latitude",required=true) Double latitude,	//纬度
			@RequestParam(name="distance",required=true)  Double distance	// 距离范围
	
			){
		return  new PageBar<Orgnization>();
	}
	
	/**根据机构间的关系查找相关机构*/
	//TODO 使用图数据库 Neo4j实现
	@RequestMapping("/searchByRelation")
	@ResponseBody
	public PageBar<Orgnization> searchByOrgRalation(
			@RequestParam(name="src_org_id",required=true) String sourceOrgId,
			@RequestParam(name="relation_type",required=true) OrgRelationType relationType,
			@RequestParam(name="step_limit",required=true) int stepLimit //最大关系路径长度
			){
		return  new PageBar<Orgnization>();
	}
	
	
}
