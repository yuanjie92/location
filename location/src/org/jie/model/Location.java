package org.jie.model;

public class Location {

	private Integer id;
	private String name;
	private String code;
	private String superCode;
	private Boolean area;
	private Boolean city;
	private Boolean province;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSuperCode() {
		return superCode;
	}
	public void setSuperCode(String superCode) {
		this.superCode = superCode;
	}
	public Boolean getArea() {
		return area;
	}
	public void setArea(Boolean area) {
		this.area = area;
	}
	public Boolean getCity() {
		return city;
	}
	public void setCity(Boolean city) {
		this.city = city;
	}
	public Boolean getProvince() {
		return province;
	}
	public void setProvince(Boolean province) {
		this.province = province;
	}
	
	
}
