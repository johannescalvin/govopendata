package govopendata.orgnization.entity;

public enum OrgRelationType {
	//START： 隶属关系
		BranchOf(1,"你所在机构是某机构的分支机构,受其领导"),
		HeadOf(1,"某机构是你所在机构的分支机构，受你所在机构的领导"),
		// 应该还有共建关系 和依托关系
		// 暂时找不到适合的表述
	//END: 隶属关系
		
	//START: 机构变更关系
	ChangedFrom(0,"更名自"),
	ChangedTo(0,"更名为"),
	MergedFrom(1,"由一个以上的原机构合并而来,被合并的机构已经不存在了"),
	MergedTo(1,"被并入某机构,被合并的机构已经不存在了"),
	DecomposedFrom(1,"你所在机构是由别的机构拆分而来，而被拆分的机构已经不存在了"),
	DecomposedTo(1,"你所在的机构将被拆解为几个新的结构,而且你所在的机构将被解散，不复存在"),
	TransferredFrom(1,"你所在机构由别的机构中的部分转换而来,而且原机构依然存在"),
	TransferredTo(1,"你所在机构的部分转为了新的机构");
	//END: 机构变更关系
	
	
	private int value;
	private String description;
	
	OrgRelationType(int value,String description){
		this.value = value;
		this.description = description;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
