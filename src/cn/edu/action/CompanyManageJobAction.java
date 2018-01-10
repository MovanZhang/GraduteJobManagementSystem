package cn.edu.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.edu.entity.TbCompany;
import cn.edu.entity.TbJob;
import cn.edu.service.CompanyManageJob;
import cn.edu.service.CompanyPreviewInfo;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyManageJobAction extends ActionSupport {
	TbCompany tbCompany;
	CompanyPreviewInfo companyPreviewInfo;
	String compUsername;
	CompanyManageJob companyManageJob;
	List<TbJob> tbJobs ;
	TbJob tbJob;
	int jobId;
	String jobTitle;
	String jobCon;
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobCon() {
		return jobCon;
	}
	public void setJobCon(String jobCon) {
		this.jobCon = jobCon;
	}
	public TbJob getTbJob() {
		return tbJob;
	}
	public void setTbJob(TbJob tbJob) {
		this.tbJob = tbJob;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public List<TbJob> getTbJobs() {
		return tbJobs;
	}
	public void setTbJobs(List<TbJob> tbJobs) {
		this.tbJobs = tbJobs;
	}
	public TbCompany getTbCompany() {
		return tbCompany;
	}
	public void setTbCompany(TbCompany tbCompany) {
		this.tbCompany = tbCompany;
	}
	public CompanyPreviewInfo getCompanyPreviewInfo() {
		return companyPreviewInfo;
	}
	public void setCompanyPreviewInfo(CompanyPreviewInfo companyPreviewInfo) {
		this.companyPreviewInfo = companyPreviewInfo;
	}
	public String getCompUsername() {
		return compUsername;
	}
	public void setCompUsername(String compUsername) {
		this.compUsername = compUsername;
	}
	public CompanyManageJob getCompanyManageJob() {
		return companyManageJob;
	}
	public void setCompanyManageJob(CompanyManageJob companyManageJob) {
		this.companyManageJob = companyManageJob;
	}
	
	public String findAllJobList(){
		System.out.println("公司查找招聘信息action中的公司用户名"+compUsername);		
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		companyManageJob=new CompanyManageJob();
		tbJobs=new  ArrayList<TbJob>();
		tbJobs=companyManageJob.findJobList(tbCompany);		
		return "comJobList";		
	}
	
	public String findOne(){
		System.out.println("findOne方法的企业登录用户名"+compUsername);
		companyManageJob=new CompanyManageJob();
		tbJob=companyManageJob.findOne(jobId);
		return "jobOne";
	}
	
	public String toInsert(){
		System.out.println("公司与插入招聘信息action中的公司用户名"+compUsername);		
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		return "toInsert";
	}
	
	public String insertJob(){
		System.out.println("公司插入招聘信息action中的公司用户名"+compUsername);		
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		tbJob.setTbCompany(tbCompany);
		Date date=new Date();
		tbJob.setJobDate(date);
		System.out.println("插入action中的公司用户名"+compUsername);
		companyManageJob=new CompanyManageJob();
		companyManageJob.insertJob(tbJob);
		
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		tbJobs=new  ArrayList<TbJob>();
		tbJobs=companyManageJob.findJobList(tbCompany);	
		return "insert";		
	}
	
	public String deleteJob(){
		companyManageJob=new CompanyManageJob();
		companyManageJob.deleteJob(jobId);
		//回显
		tbCompany=new TbCompany();
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		tbJobs=new  ArrayList<TbJob>();
		tbJobs=companyManageJob.findJobList(tbCompany);	
		return "deleteJob";	
	}
	
	public String updateJob(){
		
		tbJob=new TbJob();
		tbJob.setJobId(jobId);
		tbJob.setJobTitle(jobTitle);
		tbJob.setJobCon(jobCon);
		Date date=new Date();
		tbJob.setJobDate(date);
		System.out.println("修改工作action中的jobId"+jobId+compUsername+jobTitle+jobCon);
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		tbJob.setTbCompany(tbCompany);
		
		System.out.println("jobTitle"+jobTitle+" jobCon"+jobCon);
		companyManageJob=new CompanyManageJob();
		companyManageJob.updateJob(tbJob);
		
		tbCompany=new TbCompany();
		companyPreviewInfo =new CompanyPreviewInfo();
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);
		tbJobs=new  ArrayList<TbJob>();
		tbJobs=companyManageJob.findJobList(tbCompany);	
		return "updateJob";
	}
}
