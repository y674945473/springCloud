package org.cloud.api.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable  {
	
	private String ditemID ;
    private String dname ;
    private String dparentID ;
	public String getDitemID() {
		return ditemID;
	}
	public void setDitemID(String ditemID) {
		this.ditemID = ditemID;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDparentID() {
		return dparentID;
	}
	public void setDparentID(String dparentID) {
		this.dparentID = dparentID;
	}
	@Override
	public String toString() {
		return "Dept [ditemID=" + ditemID + ", dname=" + dname + ", dparentID=" + dparentID + "]";
	}
	public Dept(String ditemID, String dname, String dparentID) {
		super();
		this.ditemID = ditemID;
		this.dname = dname;
		this.dparentID = dparentID;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}




	
}
