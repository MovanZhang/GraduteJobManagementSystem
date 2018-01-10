package cn.edu.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TbStudent entity. @author MyEclipse Persistence Tools
 */

public class TbStudent implements java.io.Serializable {

	// Fields

	private Integer stuNum;
	private String stuId;
	private String stuPwd;
	private String stuName;
	private String stuSex;
	private String stuNation;
	private String stuPolitical;
	private String stuIdNum;
	private String stuGraUniversity;
	private String stuMajor;
	private String stuEducation;
	private String stuAdmissionTime;
	private String stuGraduateTime;
	private String stuEmail;
	private String stuTelephone;
	private String stuAddress;
	private String stuEduBac;
	private String stuLanAbi;
	private String stuExp;
	private String stuProExp;
	private String stuRewPun;
	private String stuCadres;
	private String stuSelEev;
	private String stuSpe;
	private String stuJob;
	private String stuComp;
	private Set tbStujobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbStudent() {
	}

	/** minimal constructor */
	public TbStudent(String stuId, String stuPwd) {
		this.stuId = stuId;
		this.stuPwd = stuPwd;
	}

	/** full constructor */
	public TbStudent(String stuId, String stuPwd, String stuName,
			String stuSex, String stuNation, String stuPolitical,
			String stuIdNum, String stuGraUniversity, String stuMajor,
			String stuEducation, String stuAdmissionTime,
			String stuGraduateTime, String stuEmail, String stuTelephone,
			String stuAddress, String stuEduBac, String stuLanAbi,
			String stuExp, String stuProExp, String stuRewPun,
			String stuCadres, String stuSelEev, String stuSpe, String stuJob,
			String stuComp, Set tbStujobs) {
		this.stuId = stuId;
		this.stuPwd = stuPwd;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuNation = stuNation;
		this.stuPolitical = stuPolitical;
		this.stuIdNum = stuIdNum;
		this.stuGraUniversity = stuGraUniversity;
		this.stuMajor = stuMajor;
		this.stuEducation = stuEducation;
		this.stuAdmissionTime = stuAdmissionTime;
		this.stuGraduateTime = stuGraduateTime;
		this.stuEmail = stuEmail;
		this.stuTelephone = stuTelephone;
		this.stuAddress = stuAddress;
		this.stuEduBac = stuEduBac;
		this.stuLanAbi = stuLanAbi;
		this.stuExp = stuExp;
		this.stuProExp = stuProExp;
		this.stuRewPun = stuRewPun;
		this.stuCadres = stuCadres;
		this.stuSelEev = stuSelEev;
		this.stuSpe = stuSpe;
		this.stuJob = stuJob;
		this.stuComp = stuComp;
		this.tbStujobs = tbStujobs;
	}

	// Property accessors

	public Integer getStuNum() {
		return this.stuNum;
	}

	public void setStuNum(Integer stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuPwd() {
		return this.stuPwd;
	}

	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuNation() {
		return this.stuNation;
	}

	public void setStuNation(String stuNation) {
		this.stuNation = stuNation;
	}

	public String getStuPolitical() {
		return this.stuPolitical;
	}

	public void setStuPolitical(String stuPolitical) {
		this.stuPolitical = stuPolitical;
	}

	public String getStuIdNum() {
		return this.stuIdNum;
	}

	public void setStuIdNum(String stuIdNum) {
		this.stuIdNum = stuIdNum;
	}

	public String getStuGraUniversity() {
		return this.stuGraUniversity;
	}

	public void setStuGraUniversity(String stuGraUniversity) {
		this.stuGraUniversity = stuGraUniversity;
	}

	public String getStuMajor() {
		return this.stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public String getStuEducation() {
		return this.stuEducation;
	}

	public void setStuEducation(String stuEducation) {
		this.stuEducation = stuEducation;
	}

	public String getStuAdmissionTime() {
		return this.stuAdmissionTime;
	}

	public void setStuAdmissionTime(String stuAdmissionTime) {
		this.stuAdmissionTime = stuAdmissionTime;
	}

	public String getStuGraduateTime() {
		return this.stuGraduateTime;
	}

	public void setStuGraduateTime(String stuGraduateTime) {
		this.stuGraduateTime = stuGraduateTime;
	}

	public String getStuEmail() {
		return this.stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuTelephone() {
		return this.stuTelephone;
	}

	public void setStuTelephone(String stuTelephone) {
		this.stuTelephone = stuTelephone;
	}

	public String getStuAddress() {
		return this.stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public String getStuEduBac() {
		return this.stuEduBac;
	}

	public void setStuEduBac(String stuEduBac) {
		this.stuEduBac = stuEduBac;
	}

	public String getStuLanAbi() {
		return this.stuLanAbi;
	}

	public void setStuLanAbi(String stuLanAbi) {
		this.stuLanAbi = stuLanAbi;
	}

	public String getStuExp() {
		return this.stuExp;
	}

	public void setStuExp(String stuExp) {
		this.stuExp = stuExp;
	}

	public String getStuProExp() {
		return this.stuProExp;
	}

	public void setStuProExp(String stuProExp) {
		this.stuProExp = stuProExp;
	}

	public String getStuRewPun() {
		return this.stuRewPun;
	}

	public void setStuRewPun(String stuRewPun) {
		this.stuRewPun = stuRewPun;
	}

	public String getStuCadres() {
		return this.stuCadres;
	}

	public void setStuCadres(String stuCadres) {
		this.stuCadres = stuCadres;
	}

	public String getStuSelEev() {
		return this.stuSelEev;
	}

	public void setStuSelEev(String stuSelEev) {
		this.stuSelEev = stuSelEev;
	}

	public String getStuSpe() {
		return this.stuSpe;
	}

	public void setStuSpe(String stuSpe) {
		this.stuSpe = stuSpe;
	}

	public String getStuJob() {
		return this.stuJob;
	}

	public void setStuJob(String stuJob) {
		this.stuJob = stuJob;
	}

	public String getStuComp() {
		return this.stuComp;
	}

	public void setStuComp(String stuComp) {
		this.stuComp = stuComp;
	}

	public Set getTbStujobs() {
		return this.tbStujobs;
	}

	public void setTbStujobs(Set tbStujobs) {
		this.tbStujobs = tbStujobs;
	}
	public String toString() {
		String str=stuName+stuPwd+stuSex+stuJob;
		return str;
	}
}