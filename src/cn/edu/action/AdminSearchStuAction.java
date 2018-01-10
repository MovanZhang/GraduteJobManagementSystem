package cn.edu.action;

import java.util.ArrayList;
import java.util.List;

import cn.edu.entity.TbStudent;
import cn.edu.service.AdminSearchStu;

import com.opensymphony.xwork2.ActionSupport;

public class AdminSearchStuAction extends ActionSupport{
	private String value;
	private String type;             //查询的类型
	private AdminSearchStu adminSearchStu;
	private List<TbStudent> students;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public List<TbStudent> getStudents() {
		return students;
	}
	public void setStudents(List<TbStudent> students) {
		this.students = students;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		adminSearchStu=new 	AdminSearchStu();
		students = new ArrayList<TbStudent>();		
        if(type!=null){
        	if(type.equals("学号")){
        		type="stuId";
        		//students=adminSearchStu.AdminSearchStuList(value,type);
        	}
        	else if(type.equals("专业")){
        		type="stuMajor";
        		//students=adminSearchStu.AdminSearchStuList(value,type);
        	}
        	else if(type.equals("姓名")){
        		type="stuName";
        		//students=adminSearchStu.AdminSearchStuList(value,type);
        	}
        	students=adminSearchStu.AdminSearchStuList(value,type);
        	if(students!=null){
        		return SUCCESS;
        	}
        }
        return INPUT;
	}
    
}
