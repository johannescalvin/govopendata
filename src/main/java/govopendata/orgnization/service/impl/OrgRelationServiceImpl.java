package govopendata.orgnization.service.impl;

import org.springframework.stereotype.Service;

import govopendata.orgnization.entity.OrgRelationType;
import govopendata.orgnization.service.OrgRelationService;
import govopendata.utils.ResultStatus;

@Service
public class OrgRelationServiceImpl implements  OrgRelationService {

	@Override
	public ResultStatus create(Long sourceOrgId, Long destOrgId, OrgRelationType relationType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultStatus delete(Long sourceOrgId, Long destOrgId, OrgRelationType relationType) {
		// TODO Auto-generated method stub
		return null;
	}

}
