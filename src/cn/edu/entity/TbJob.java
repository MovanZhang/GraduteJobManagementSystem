package cn.edu.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbJob entity. @author MyEclipse Persistence Tools
 */

public class TbJob implements java.io.Serializable {

	// Fields

	private Integer jobId;
	private TbCompany tbCompany;
	private String jobTitle;
	private String jobCon;
	private Date jobDate;
	private Set tbStujobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbJob() {
	}

	/** full constructor */
	public TbJob(TbCompany tbCompany, String jobTitle, String jobCon,
			Date jobDate, Set tbStujobs) {
		this.tbCompany = tbCompany;
		this.jobTitle = jobTitle;
		this.jobCon = jobCon;
		this.jobDate = jobDate;
		this.tbStujobs = tbStujobs;
	}

	// Property accessors

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public TbCompany getTbCompany() {
		return this.tbCompany;
	}

	public void setTbCompany(TbCompany tbCompany) {
		this.tbCompany = tbCompany;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobCon() {
		return this.jobCon;
	}

	public void setJobCon(String jobCon) {
		this.jobCon = jobCon;
	}

	public Date getJobDate() {
		return this.jobDate;
	}

	public void setJobDate(Date jobDate) {
		this.jobDate = jobDate;
	}

	public Set getTbStujobs() {
		return this.tbStujobs;
	}

	public void setTbStujobs(Set tbStujobs) {
		this.tbStujobs = tbStujobs;
	}

}