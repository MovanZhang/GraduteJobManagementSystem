package cn.edu.service;
import java.util.*;
import cn.edu.dao.TbJobDAO;
import cn.edu.entity.TbJob;
public class adminExamJobList {
	@SuppressWarnings("unchecked")
	public List<TbJob> findAll(){
		TbJobDAO tbJobDAO=new TbJobDAO();		
		return tbJobDAO.findAll();
		
	}
	public TbJob findById(java.lang.Integer id){		
		TbJobDAO tbJobDAO=new TbJobDAO();
		return tbJobDAO.findById(id);
		
	}
	public void delete(TbJob persistentInstance) {
		TbJobDAO tbJobDAO=new TbJobDAO();
		//System.out.println(this.getClass()+".delete("+persistentInstance.toString()+")");
		tbJobDAO.delete(persistentInstance);
	}
}
