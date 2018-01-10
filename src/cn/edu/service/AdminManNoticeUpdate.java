package cn.edu.service;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.dao.TbPolicyDAO;
import cn.edu.entity.TbPolicy;

public class AdminManNoticeUpdate {
	private TbPolicy tbPolicy;
	private TbPolicyDAO tbPolicyDAO;

	public TbPolicy getTbPolicy() {
		return tbPolicy;
	}

	public void setTbPolicy(TbPolicy tbPolicy) {
		this.tbPolicy = tbPolicy;
	}
    
	public TbPolicyDAO getTbPolicyDAO() {
		return tbPolicyDAO;
	}

	public void setTbPolicyDAO(TbPolicyDAO tbPolicyDAO) {
		this.tbPolicyDAO = tbPolicyDAO;
	}
    /*
	 * public TbPolicy find(int id){ try{ tbPolicy=tbPolicyDAO.findById(id);
	 * return tbPolicy; }catch(Throwable te){ System.err.println(this.getClass()
	 * + " ERROR:查找出错！ "); te.printStackTrace(); return tbPolicy=null; } }
	 */
	public TbPolicy findPolicyById(int id){
		 tbPolicyDAO =new TbPolicyDAO();
		 tbPolicy = new TbPolicy();
		 tbPolicy=tbPolicyDAO.findById(id);
		if(tbPolicy!=null){
			   System.out.println("已找到要修改的信息");
		   }else
			   System.out.println("未找到要修改的信息");
		   return tbPolicy;
		
	}
	public boolean updateNotice(TbPolicy policy) {
		 tbPolicyDAO =new TbPolicyDAO();
		 try{
			    tbPolicyDAO.merge(policy);
		    return true;
		}catch(Throwable te){
			 System.err.println(this.getClass()+"调用查找方法出错！");
	   		   te.printStackTrace();
	   		   return false;
		}
	}
	}

