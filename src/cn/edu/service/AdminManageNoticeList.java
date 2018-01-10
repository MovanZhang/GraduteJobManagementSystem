package cn.edu.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.dao.TbPolicyDAO;
import cn.edu.entity.TbPolicy;

import com.opensymphony.xwork2.ActionContext;

public class AdminManageNoticeList {
	private ActionContext ctx;
	private TbPolicyDAO policyDAO;
	private List<TbPolicy> policys;
	public List ManageNoticeList(){
		policyDAO=new TbPolicyDAO();
		policys=new ArrayList<TbPolicy>();
		try{
			policys=policyDAO.findAll();
			return policys;
			
		}catch(Throwable te){
			System.err.println(this.getClass() + " ERROR:≤È’“≥ˆ¥Ì¡À");
   			te.printStackTrace();
   			return policys=null;
		}
				
	}
	
}
