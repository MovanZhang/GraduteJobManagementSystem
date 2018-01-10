package cn.edu.service;

import java.util.ArrayList;

import cn.edu.dao.TbCompanyDAO;
import cn.edu.entity.TbCompany;

public class CompanyCompleteInfo {
	TbCompany tbCompany;
	TbCompanyDAO tbCompanyDAO;

	public void completeInfo(TbCompany company) {
		tbCompany = new TbCompany();
		tbCompanyDAO = new TbCompanyDAO();
		ArrayList<TbCompany> tbCompanys = new ArrayList<TbCompany>();
		tbCompanys = (ArrayList<TbCompany>) tbCompanyDAO
				.findByCompUsername(company.getCompUsername());
		tbCompany = tbCompanys.get(0);
		tbCompany.setCompName(company.getCompName());		
		tbCompany.setCompProperty(company.getCompProperty());
		tbCompany.setCompConPer(company.getCompConPer());
		tbCompany.setCompIndustry(company.getCompIndustry());
		tbCompany.setCompSize(company.getCompSize());
		tbCompany.setCompAddress(company.getCompAddress());
		tbCompany.setCompConPer(company.getCompConPer());
		tbCompany.setCompEmail(company.getCompEmail());
		tbCompany.setCompTel(company.getCompTel());
		tbCompany.setCompZipCode(company.getCompZipCode());
		tbCompany.setCompIntro(company.getCompIntro());
		tbCompanyDAO.merge(tbCompany);		
	}
}
