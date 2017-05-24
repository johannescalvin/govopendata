package govopendata.orgnization.entity;
/**机构类型*/
public enum OrgType {
	Xingzheng(1,"行政"),
	Sifa(2,"司法"),
	Lifa(3,"立法"),
	Zhengxie(4,"政协"),
	Keyan(5,"科研");
	
	private int value;
	private String description;
	OrgType(int value,String description){
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
