package cn.edu.entity;

import java.util.Date;

/**
 * TbPolicy entity. @author MyEclipse Persistence Tools
 */

public class TbPolicy implements java.io.Serializable {

	// Fields

	private Integer policyId;
	private String policyTitle;
	private String policyCon;
	private Date policyDate;

	// Constructors

	/** default constructor */
	public TbPolicy() {
	}

	/** full constructor */
	public TbPolicy(String policyTitle, String policyCon, Date policyDate) {
		this.policyTitle = policyTitle;
		this.policyCon = policyCon;
		this.policyDate = policyDate;
	}

	// Property accessors

	public Integer getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyTitle() {
		return this.policyTitle;
	}

	public void setPolicyTitle(String policyTitle) {
		this.policyTitle = policyTitle;
	}

	public String getPolicyCon() {
		return this.policyCon;
	}

	public void setPolicyCon(String policyCon) {
		this.policyCon = policyCon;
	}

	public Date getPolicyDate() {
		return this.policyDate;
	}

	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
	}

}