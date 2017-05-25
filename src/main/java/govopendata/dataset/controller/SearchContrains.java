package govopendata.dataset.controller;

import java.util.Date;

class SearchContrains {
	/**创建起止时间*/
	private Date createdTimeFrom;
	private Date  createdTimeTo;
	/**修改起止时间*/
	private Date modifiedTimeFrom;
	private Date modifiedTimeTo;
	
	public Date getCreatedTimeFrom() {
		return createdTimeFrom;
	}
	public void setCreatedTimeFrom(Date createdTimeFrom) {
		this.createdTimeFrom = createdTimeFrom;
	}
	public Date getCreatedTimeTo() {
		return createdTimeTo;
	}
	public void setCreatedTimeTo(Date createdTimeTo) {
		this.createdTimeTo = createdTimeTo;
	}
	public Date getModifiedTimeFrom() {
		return modifiedTimeFrom;
	}
	public void setModifiedTimeFrom(Date modifiedTimeFrom) {
		this.modifiedTimeFrom = modifiedTimeFrom;
	}
	public Date getModifiedTimeTo() {
		return modifiedTimeTo;
	}
	public void setModifiedTimeTo(Date modifiedTimeTo) {
		this.modifiedTimeTo = modifiedTimeTo;
	}
	
}
