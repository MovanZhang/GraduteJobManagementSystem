package cn.edu.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TbCompany entity. @author MyEclipse Persistence Tools
 */

public class TbCompany implements java.io.Serializable {

	// Fields

	private Integer compId;
	private String compUsername;
	private String compPwd;
	private String compName;
	private String compProperty;
	private String compIndustry;
	private String compSize;
	private String compAddress;
	private String compConPer;
	private String compEmail;
	private String compTel;
	private String compZipCode;
	private String compIntro;
	private Set tbJobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbCompany() {
	}

	/** full constructor */
	public TbCompany(String compUsername, String compPwd, String compName,
			String compProperty, String compIndustry, String compSize,
			String compAddress, String compConPer, String compEmail,
			String compTel, String compZipCode, String compIntro, Set tbJobs) {
		this.compUsername = compUsername;
		this.compPwd = compPwd;
		this.compName = compName;
		this.compProperty = compProperty;
		this.compIndustry = compIndustry;
		this.compSize = compSize;
		this.compAddress = compAddress;
		this.compConPer = compConPer;
		this.compEmail = compEmail;
		this.compTel = compTel;
		this.compZipCode = compZipCode;
		this.compIntro = compIntro;
		this.tbJobs = tbJobs;
	}

	// Property accessors

	public Integer getCompId() {
		return this.compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public String getCompUsername() {
		return this.compUsername;
	}

	public void setCompUsername(String compUsername) {
		this.compUsername = compUsername;
	}

	public String getCompPwd() {
		return this.compPwd;
	}

	public void setCompPwd(String compPwd) {
		this.compPwd = compPwd;
	}

	public String getCompName() {
		return this.compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompProperty() {
		return this.compProperty;
	}

	public void setCompProperty(String compProperty) {
		this.compProperty = compProperty;
	}

	public String getCompIndustry() {
		return this.compIndustry;
	}

	public void setCompIndustry(String compIndustry) {
		this.compIndustry = compIndustry;
	}

	public String getCompSize() {
		return this.compSize;
	}

	public void setCompSize(String compSize) {
		this.compSize = compSize;
	}

	public String getCompAddress() {
		return this.compAddress;
	}

	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}

	public String getCompConPer() {
		return this.compConPer;
	}

	public void setCompConPer(String compConPer) {
		this.compConPer = compConPer;
	}

	public String getCompEmail() {
		return this.compEmail;
	}

	public void setCompEmail(String compEmail) {
		this.compEmail = compEmail;
	}

	public String getCompTel() {
		return this.compTel;
	}

	public void setCompTel(String compTel) {
		this.compTel = compTel;
	}

	public String getCompZipCode() {
		return this.compZipCode;
	}

	public void setCompZipCode(String compZipCode) {
		this.compZipCode = compZipCode;
	}

	public String getCompIntro() {
		return this.compIntro;
	}

	public void setCompIntro(String compIntro) {
		this.compIntro = compIntro;
	}

	public Set getTbJobs() {
		return this.tbJobs;
	}

	public void setTbJobs(Set tbJobs) {
		this.tbJobs = tbJobs;
	}
	public String toString() {
		String str=compId+compName;
		return str;
	}
}