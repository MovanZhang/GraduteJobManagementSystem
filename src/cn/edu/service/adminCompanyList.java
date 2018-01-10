package cn.edu.service;
import java.util.*;
import cn.edu.dao.TbCompanyDAO;
import cn.edu.entity.TbCompany;

public class adminCompanyList {
	@SuppressWarnings("unchecked")
	public List<TbCompany> findAll(){
		TbCompanyDAO tbCompanyDAO=new TbCompanyDAO();		
		return tbCompanyDAO.findAll();
		
	}
	public TbCompany findById(java.lang.Integer id){
		System.out.println("---------");
		TbCompanyDAO tbCompanyDAO=new TbCompanyDAO();
		return tbCompanyDAO.findById(id);
		
	}
	public void delete(TbCompany persistentInstance) {
		System.out.println("445454545454");
		TbCompanyDAO tbCompanyDAO=new TbCompanyDAO();
		//System.out.println(this.getClass()+".delete("+persistentInstance.toString()+")");
		 tbCompanyDAO.delete(persistentInstance);
	}
}
