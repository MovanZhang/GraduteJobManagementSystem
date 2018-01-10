package cn.edu.service;

import cn.edu.dao.TbPolicyDAO;
import cn.edu.entity.TbPolicy;
public class AdminManNoticeDelete {
	  private TbPolicy tbPolicy;
      private TbPolicyDAO tbPolicyDAO=new TbPolicyDAO();
     
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
	public TbPolicy find(int id){
		try{
			tbPolicy=new TbPolicy();
			tbPolicy=tbPolicyDAO.findById(id);
			return tbPolicy;
		}catch(Throwable te){
			System.err.println(this.getClass() + " ERROR:²éÕÒ³ö´í£¡ ");
			te.printStackTrace();
			return tbPolicy=null;
		}
	}
    public boolean deletePolicy(TbPolicy policy){
    	
    	try{
    		tbPolicyDAO.delete(policy);
    		return true;
    	}catch(Throwable te){
    		System.err.println(this.getClass() + " ERROR: ");
			te.printStackTrace();
			return false; 		
    	}   	
    }  
}
