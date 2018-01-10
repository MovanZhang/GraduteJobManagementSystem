package cn.edu.action;

import cn.edu.entity.TbCompany;
import cn.edu.service.CompanyPreviewInfo;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyPreviewInfoAction extends ActionSupport {
	TbCompany tbCompany;
	CompanyPreviewInfo companyPreviewInfo;
	String compUsername;
	
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
	
	public String execute(){
		tbCompany=new TbCompany();
		companyPreviewInfo=new CompanyPreviewInfo();
		System.out.println("公司初始查看自己信息时的用户名"+compUsername);
		tbCompany=companyPreviewInfo.findCompanyInfo(compUsername);		
		return SUCCESS;
		
	}
}
