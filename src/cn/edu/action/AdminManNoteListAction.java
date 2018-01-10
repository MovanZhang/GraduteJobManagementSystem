package cn.edu.action;

import java.util.ArrayList;
import java.util.List;

import cn.edu.entity.TbPolicy;
import cn.edu.service.AdminManageNoticeList;

import com.opensymphony.xwork2.ActionSupport;

public class AdminManNoteListAction extends ActionSupport {
	private AdminManageNoticeList adminManageNoticeList;
	private List<TbPolicy> policys;

	int currentPage;
	int size;
	int count;
	int total;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public AdminManageNoticeList getAdminManageNoticeList() {
		return adminManageNoticeList;
	}

	public void setAdminManageNoticeList(
			AdminManageNoticeList adminManageNoticeList) {
		this.adminManageNoticeList = adminManageNoticeList;
	}

	public List<TbPolicy> getPolicys() {
		return policys;
	}

	public void setPolicys(List<TbPolicy> policys) {
		this.policys = policys;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<TbPolicy> policys1 = new ArrayList<TbPolicy>();

		adminManageNoticeList = new AdminManageNoticeList();
		policys = new ArrayList<TbPolicy>();
		policys1 = adminManageNoticeList.ManageNoticeList();
		System.out.println("公告信息已经读取到了！");
		if (policys.size() >= 0) {
			count = policys1 .size();
			if (count == 0) {
				return SUCCESS;
			}
			setSize(2);
			if (count % size != 0) {
				total = count / size + 1;
			} else {
				total = count / size;
			}
			if (currentPage <= 1) {
				currentPage = 1;
			}
			if (currentPage > total) {
				currentPage = total;
			}

			for (int i = 0; i < size; i++) {
				int m;
				m = (getCurrentPage() - 1) * size + i;
				if(m<policys1.size()){
				policys .add(policys1.get(m));
				}
			}
			return SUCCESS;
		} else
			return INPUT;
	}

}
