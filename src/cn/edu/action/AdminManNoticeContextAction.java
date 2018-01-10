package cn.edu.action;

import cn.edu.dao.TbPolicyDAO;
import cn.edu.entity.TbPolicy;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AdminManNoticeContextAction extends ActionSupport {
	 private int policyId;
	 private TbPolicy tbp;
	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public TbPolicy getTbp() {
		return tbp;
	}

	public void setTbp(TbPolicy tbp) {
		this.tbp = tbp;
	}	

	public String execute() throws Exception {
		TbPolicyDAO policy = new TbPolicyDAO();
		tbp = policy.findById(policyId);
		return "success";
	}
}
