package com.spring.mvc.entity;

public class User {
	
	private int id;
	private String fullName;
	private String eamil;
	private String password;
	private String check;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the eamil
	 */
	public String getEamil() {
		return eamil;
	}
	/**
	 * @param eamil the eamil to set
	 */
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the check
	 */
	public String getCheck() {
		return check;
	}
	/**
	 * @param check the check to set
	 */
	public void setCheck(String check) {
		this.check = check;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", eamil=" + eamil + ", password=" + password + ", check="
				+ check + "]";
	}

	
}
