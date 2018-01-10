package cn.edu.service;

import java.util.ArrayList;
import java.util.List;


import cn.edu.dao.TbStudentDAO;
import cn.edu.entity.TbStudent;

import com.opensymphony.xwork2.ActionContext;

public class AdminSearchStu {
	
	private TbStudentDAO studentDAO;
	private List<TbStudent> students;

	public List AdminSearchStuList(String rule, String type) {
		studentDAO = new TbStudentDAO();
		students = new ArrayList<TbStudent>();
		// 测试参数是否传递成功
		System.out.println(rule);
		System.out.println(type);
		try {
		students=studentDAO.findByProperty(type, rule);
       if(!students.isEmpty()){
    	   return students;
    		   
    	   }else{
    		   return students=null;
    	   }
		}catch (Throwable te) {
   			System.err.println(this.getClass() + " ERROR: ");
   			te.printStackTrace();
   			return students=null;
   		}
       }
	}


