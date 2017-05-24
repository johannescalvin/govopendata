package govopendata.orgnization.service;

import govopendata.orgnization.entity.OrgRelationType;
import govopendata.utils.ResultStatus;

public interface OrgRelationService {
	public ResultStatus create(Long sourceOrgId, Long destOrgId,OrgRelationType relationType);
	public ResultStatus delete(Long sourceOrgId, Long destOrgId,OrgRelationType relationType);
}
