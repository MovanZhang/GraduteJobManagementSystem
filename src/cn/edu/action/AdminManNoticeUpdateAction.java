package cn.edu.action;

import java.util.Date;

import cn.edu.entity.TbPolicy;
import cn.edu.service.AdminManNoticeUpdate;

import com.opensymphony.xwork2.ActionSupport;

public class AdminManNoticeUpdateAction extends ActionSupport {
	private String title;
	private String content;
	private TbPolicy policy = new TbPolicy();
	private int searchid;
	private int Id;
	private AdminManNoticeUpdate adminManNoticeUpdate = new AdminManNoticeUpdate();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TbPolicy getPolicy() {
		return policy;
	}

	public void setPolicy(TbPolicy policy) {
		this.policy = policy;
	}

	public int getSearchid() {
		return searchid;
	}

	public void setSearchid(int searchid) {
		this.searchid = searchid;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public AdminManNoticeUpdate getAdminManNoticeUpdate() {
		return adminManNoticeUpdate;
	}

	public void setAdminManNoticeUpdate(
			AdminManNoticeUpdate adminManNoticeUpdate) {
		this.adminManNoticeUpdate = adminManNoticeUpdate;
	}

	public String findPolicy() {
		if ((adminManNoticeUpdate.findPolicyById(Id)) != null) {
			setPolicy(adminManNoticeUpdate.findPolicyById(Id));
			return SUCCESS;
		} else
			return INPUT;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// try{
		policy.setPolicyId(adminManNoticeUpdate.findPolicyById(searchid)
				.getPolicyId());
		policy.setPolicyTitle(title);
		policy.setPolicyCon(content);
		Date date=new Date();
		policy.setPolicyDate(date);
		if (adminManNoticeUpdate.updateNotice(policy)) {
			System.out.println(policy.getPolicyId());
			System.out.println("更新成功！");
			return SUCCESS;
		} else {
			System.out.println("更新失败！");
			return INPUT;
		}

	}
}
