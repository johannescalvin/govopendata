package govopendata.orgnization.entity;

public class Location {
	/**地址名称*/
	private String address;
	/**经度*/
	private Double longitude;
	/**纬度*/
	private Double latitude;
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
}
