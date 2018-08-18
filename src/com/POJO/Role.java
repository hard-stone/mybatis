package com.POJO;


public class Role {
	private Long id;
	private String roleName;
	private String note;
	
	public Role() {
		super();
	}
	
	public Role(String roleName, String note) {
		super();
		this.roleName = roleName;
		this.note = note;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
