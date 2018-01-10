package cn.edu.action;

import cn.edu.entity.TbStudent;
import cn.edu.service.StudentRegist;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StudentRegistAction extends ActionSupport {

	TbStudent tbStudent;
	StudentRegist studentRegist;
	String restuPwd;
	
	public String getRestuPwd() {
		return restuPwd;
	}

	public void setRestuPwd(String restuPwd) {
		this.restuPwd = restuPwd;
	}

	public TbStudent getTbStudent() {
		return tbStudent;
	}

	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}

	public StudentRegist getStudentRegist() {
		return studentRegist;
	}

	public void setStudentRegist(StudentRegist studentRegist) {
		this.studentRegist = studentRegist;
	}

	public String execute() throws Exception {
		try {
			System.out.println("学生注册的Action层" + tbStudent.getStuId()
					+ tbStudent.getStuName() + tbStudent.getStuTelephone()
					+ tbStudent.getStuPwd());
			System.out.println("学生注册的Action层,确认密码的值"+restuPwd);
			
			if(restuPwd.equals(tbStudent.getStuPwd()))
			{
				boolean isRegist;
				studentRegist = new StudentRegist();
				isRegist = studentRegist.checkStudentRegist(tbStudent.getStuId(),
						tbStudent.getStuName(), tbStudent.getStuTelephone(),
						tbStudent.getStuPwd());

				if (isRegist) {
					System.out.println("注册成功！");
					return SUCCESS;
				} else
					return "alreadyexit";
			} else{
				return "NotEquale";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			return INPUT;
		}
		

	}
}
