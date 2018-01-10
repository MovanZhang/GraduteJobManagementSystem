package cn.edu.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.entity.TbStudent;
import cn.edu.service.StudentLogin;
import cn.edu.service.StudentPreviewResume;

@SuppressWarnings("serial")
public class StudentLoginAction extends ActionSupport{
	private TbStudent tbStudent;
	private StudentLogin studentLogin;	
	StudentPreviewResume studentPreviewResume;
	private String chknumber;
	
	
	public String getChknumber() {
		return chknumber;
	}
	public void setChknumber(String chknumber) {
		this.chknumber = chknumber;
	}
	public StudentPreviewResume getStudentPreviewResume() {
		return studentPreviewResume;
	}
	public void setStudentPreviewResume(StudentPreviewResume studentPreviewResume) {
		this.studentPreviewResume = studentPreviewResume;
	}
	public TbStudent getTbStudent() {
		return tbStudent;
	}
	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}
	public StudentLogin getStudentLogin() {
		return studentLogin;
	}
	public void setStudentLogin(StudentLogin studentLogin) {
		this.studentLogin = studentLogin;
	}
	@Override
	public String execute() throws Exception {
		//验证学生登录
				Map<String, Object> session=ServletActionContext.getContext().getSession();
				session.get("randomCode").equals(chknumber);
				boolean isStudent;
				boolean  ch;
				ch=session.get("randomCode").equals(chknumber);
				System.out.println(" "+tbStudent.getStuId() +" "+tbStudent.getStuPwd());	
			
				studentLogin=new StudentLogin();
				isStudent=studentLogin.checkStudentLogin(tbStudent.getStuId(),tbStudent.getStuPwd());	
				if (isStudent&&ch) {
					System.out.println("登陆成功");
					studentPreviewResume=new StudentPreviewResume();
					tbStudent=studentPreviewResume.findStuInfo(tbStudent.getStuId());
					return SUCCESS;
				}
				
				else 
					return INPUT;
			}
			

	
}
