package cn.edu.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.entity.ComJobStu;
import cn.edu.service.CompCheckStudentList;

public class CompCheckStudentAction  extends ActionSupport{
	String compUserName;
	List<ComJobStu> comJobStuList;
	CompCheckStudentList compCheckStudentList;
	ComJobStu comJobStu;
	
	public ComJobStu getComJobStu() {
		return comJobStu;
	}
	public void setComJobStu(ComJobStu comJobStu) {
		this.comJobStu = comJobStu;
	}
	public String getCompUserName() {
		return compUserName;
	}
	public void setCompUserName(String compUserName) {
		this.compUserName = compUserName;
	}
	public List<ComJobStu> getComJobStuList() {
		return comJobStuList;
	}
	public void setComJobStuList(List<ComJobStu> comJobStuList) {
		this.comJobStuList = comJobStuList;
	}
	public CompCheckStudentList getCompCheckStudentList() {
		return compCheckStudentList;
	}
	public void setCompCheckStudentList(CompCheckStudentList compCheckStudentList) {
		this.compCheckStudentList = compCheckStudentList;
	}
	
	public String execute(){
		compCheckStudentList=new CompCheckStudentList();
		comJobStuList=compCheckStudentList.compCheckStuList(compUserName);
		return SUCCESS;
	}
}
