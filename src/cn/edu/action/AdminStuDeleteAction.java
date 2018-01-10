package cn.edu.action;

import cn.edu.entity.TbStudent;
import cn.edu.entity.TbStujob;
import cn.edu.service.AdminStuDelete;

import com.opensymphony.xwork2.ActionSupport;

public class AdminStuDeleteAction extends ActionSupport{
	  int deleteId;
      private TbStudent tbStudent;
      private AdminStuDelete  adminStuDelete ;
	  public int getDeleteId() {
		return deleteId;
	}
       public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
	}
	public TbStudent getTbStudent() {
		return tbStudent;
	}
	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}
	public AdminStuDelete getAdminStuDelete() {
		return adminStuDelete;
	}
	public void setAdminStuDelete(AdminStuDelete adminStuDelete) {
		this.adminStuDelete = adminStuDelete;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		adminStuDelete =new AdminStuDelete ();
		tbStudent=adminStuDelete.findStudent(deleteId);
		 System.out.println("需要删除的学生学号是:"+tbStudent.getStuId());
		 System.out.println("需要删除的学生姓名是:"+tbStudent.getStuName());
		 boolean flag=adminStuDelete.deleteStudent(tbStudent);
		 if(flag){
			 System.out.println("删除成功！");
			 return SUCCESS;
		 }
		 else{
			 System.out.println("删除失败！");
			 return INPUT;
		 }
	}
}
