package cn.edu.action;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.entity.TbStudent;
import cn.edu.service.StudentPreviewResume;

@SuppressWarnings("serial")
public class StudentPreviewResumeAction extends ActionSupport{
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
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object sessionStuId = session.get("session_stuId");
		if (sessionStuId == null) {
			ServletActionContext.getResponse().sendError(HttpServletResponse.SC_FORBIDDEN);
			return NONE;
		}
		stuId = sessionStuId.toString();
		tbStudent=new TbStudent();
		studentPreviewResume=new StudentPreviewResume();
		tbStudent=studentPreviewResume.findStuInfo(stuId);
		return SUCCESS;
	}
}
