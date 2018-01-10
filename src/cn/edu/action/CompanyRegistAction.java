package cn.edu.action;

import cn.edu.entity.TbCompany;
import cn.edu.service.CompanyRegist;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CompanyRegistAction extends ActionSupport {

	TbCompany tbCompany;
	CompanyRegist companyRegist;
	String restuPwd;
	
	
	
	
	
	public TbCompany getTbCompany() {
		return tbCompany;
	}





	public void setTbCompany(TbCompany tbCompany) {
		this.tbCompany = tbCompany;
	}





	public CompanyRegist getCompanyRegist() {
		return companyRegist;
	}





	public void setCompanyRegist(CompanyRegist companyRegist) {
		this.companyRegist = companyRegist;
	}





	public String getRestuPwd() {
		return restuPwd;
	}





	public void setRestuPwd(String restuPwd) {
		this.restuPwd = restuPwd;
	}





	public String execute() throws Exception {
		try {
			System.out.println("注册的Action层" + tbCompany.getCompUsername()
					+ tbCompany.getCompName() + tbCompany.getCompTel()
					+ tbCompany.getCompPwd());
			System.out.println("注册的Action层,确认密码的值"+restuPwd);
			
			if(restuPwd.equals(tbCompany.getCompPwd()))
			{
				boolean isRegist;
				companyRegist = new CompanyRegist();
				isRegist = companyRegist.checkCompanyRegist(tbCompany.getCompUsername(),
						tbCompany.getCompName(), tbCompany.getCompProperty(),tbCompany.getCompSize(),
						tbCompany.getCompPwd());

				if (isRegist) {
					System.out.println("注册成功！");
					return SUCCESS;
				} else
					return "alreadyexit";
			} else{
				return "NotEquale";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			return INPUT;
		}
		

	}
}
