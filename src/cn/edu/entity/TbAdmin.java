package cn.edu.entity;

/**
 * TbAdmin entity. @author MyEclipse Persistence Tools
 */

public class TbAdmin implements java.io.Serializable {

	// Fields

	private Integer adminNum;
	private String adminId;
	private String adminPwd;

	// Constructors

	/** default constructor */
	public TbAdmin() {
	}

	/** full constructor */
	public TbAdmin(String adminId, String adminPwd) {
		this.adminId = adminId;
		this.adminPwd = adminPwd;
	}

	// Property accessors

	public Integer getAdminNum() {
		return this.adminNum;
	}

	public void setAdminNum(Integer adminNum) {
		this.adminNum = adminNum;
	}

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

}