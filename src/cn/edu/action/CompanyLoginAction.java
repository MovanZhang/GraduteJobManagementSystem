package cn.edu.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.entity.TbCompany;
import cn.edu.service.CompanyLogin;
/*import cn.edu.service.StudentPreviewResume;*/

@SuppressWarnings("serial")
public class CompanyLoginAction extends ActionSupport{
	
	
	private TbCompany tbCompany;
	private CompanyLogin companyLogin;	
	
	 private String chknumber;     	
  	
  	public String getChknumber() {
  		return chknumber;
  	}
  	public void setChknumber(String chknumber) {
  		this.chknumber = chknumber;
  	}
	@Override
	public String execute() throws Exception {
		//µÇÂ¼
		System.out.println(" "+tbCompany.getCompUsername() +" "+tbCompany.getCompPwd());	
		boolean isCompany;
		companyLogin=new CompanyLogin();
		Map<String, Object> session=ServletActionContext.getContext().getSession();
		session.get("randomCode").equals(chknumber);
		boolean  ch;
		ch=session.get("randomCode").equals(chknumber);
		isCompany=companyLogin.checkCompanyLogin(tbCompany.getCompUsername(),tbCompany.getCompPwd());	
		if (isCompany&&ch) {
			System.out.println("µÇÂ½³É¹¦");
			
			/*
			studentPreviewResume=new StudentPreviewResume();
			tbCompany=studentPreviewResume.findStuInfo(tbCompany.getStuId());*/						
			return SUCCESS;
		}
		
		else 
			return INPUT;
	}



	public TbCompany getTbCompany() {
		return tbCompany;
	}



	public void setTbCompany(TbCompany tbCompany) {
		this.tbCompany = tbCompany;
	}



	public CompanyLogin getCompanyLogin() {
		return companyLogin;
	}



	public void setCompanyLogin(CompanyLogin companyLogin) {
		this.companyLogin = companyLogin;
	}
	
}
