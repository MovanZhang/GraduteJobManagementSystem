package cn.edu.service;

import java.util.ArrayList;
import cn.edu.dao.TbCompanyDAO;
import cn.edu.entity.TbCompany;

public class CompanyPreviewInfo {
	TbCompany tbCompany;
	TbCompanyDAO tbCompanyDAO;
	
	@SuppressWarnings("unchecked")
	public TbCompany findCompanyInfo(String compUsername){
		tbCompany=new TbCompany();
		tbCompanyDAO=new TbCompanyDAO();
		System.out.println("查询公司信息的Service层"+compUsername);
		ArrayList<TbCompany> tbCompanys=new  ArrayList<TbCompany>();
		tbCompanys=(ArrayList<TbCompany>) tbCompanyDAO.findByCompUsername(compUsername);
		tbCompany=tbCompanys.get(0);
		System.out.println("查询公司信息的Service层中公司编号"+tbCompany.getCompId()+"用户名"+tbCompany.getCompUsername());
		
		return tbCompany;
		
	}
}
