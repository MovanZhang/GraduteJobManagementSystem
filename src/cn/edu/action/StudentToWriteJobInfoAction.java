package cn.edu.action;

import cn.edu.entity.TbStudent;
import cn.edu.service.StudentPreviewResume;

import com.opensymphony.xwork2.ActionSupport;

public class StudentToWriteJobInfoAction extends ActionSupport {
	TbStudent tbStudent;
	StudentPreviewResume studentPreviewResume;
	String stuId;
	

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public TbStudent getTbStudent() {
		return tbStudent;
	}

	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}
	
	public String execute() throws Exception{
		tbStudent=new TbStudent();
		studentPreviewResume=new StudentPreviewResume();
		System.out.println("填写就业信息中的tbStudent的信息"+tbStudent.getStuId());
		System.out.println("填写就业信息中的学生学号"+stuId);
		tbStudent=studentPreviewResume.findStuInfo(stuId);
		System.out.println("action+"+tbStudent.getStuName());
		System.out.println("填写就业信息中我要获取的信息是："+tbStudent);
		return SUCCESS;
	}
}
