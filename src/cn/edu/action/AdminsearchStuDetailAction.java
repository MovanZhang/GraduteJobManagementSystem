package cn.edu.action;

import cn.edu.entity.TbStudent;
import cn.edu.service.AdminsearchStuDetail;

import com.opensymphony.xwork2.ActionSupport;

public class AdminsearchStuDetailAction extends ActionSupport{
	private int searchstuid;
	private TbStudent student;
	private AdminsearchStuDetail searchStuDetail;
	public int getSearchstuid() {
		return searchstuid;
	}
	public void setSearchstuid(int searchstuid) {
		this.searchstuid = searchstuid;
	}
	public TbStudent getStudent() {
		return student;
	}
	public void setStudent(TbStudent student) {
		this.student = student;
	}
	public AdminsearchStuDetail getSearchStuDetail() {
		return searchStuDetail;
	}
	public void setSearchStuDetail(AdminsearchStuDetail searchStuDetail) {
		this.searchStuDetail = searchStuDetail;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		searchStuDetail=new AdminsearchStuDetail();
		System.out.println("我获取到的要查找的学生id:"+searchstuid);
		student=searchStuDetail.searchStudentInfo(searchstuid);
		return SUCCESS;
	}
	
}
