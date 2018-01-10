package cn.edu.action;

import cn.edu.entity.TbStudent;
import cn.edu.service.StuSendResume;
import cn.edu.service.StudentPreviewResume;

import com.opensymphony.xwork2.ActionSupport;

public class StudentSendResumeAction extends ActionSupport{
	
	TbStudent tbStudent;
	String stuId;
	int jobId;
	public TbStudent getTbStudent() {
		return tbStudent;
	}
	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public String  execute() {
		System.out.println("在学生简历投递的Action中的学号"+stuId);
		System.out.println("在学生简历投递的Action中的工作编号"+jobId);
		StudentPreviewResume studentPreviewResume=new StudentPreviewResume();
		tbStudent=studentPreviewResume.findStuInfo(stuId);
		StuSendResume stuSendResume=new StuSendResume();
		
		if (stuSendResume.senResume(tbStudent, jobId)) {
			return SUCCESS;
		}else {
			return "false";
		}
		
		
	}
}
