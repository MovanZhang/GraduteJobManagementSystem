package cn.edu.service;

import cn.edu.dao.TbStudentDAO;
import cn.edu.entity.TbStudent;

public class AdminsearchStuDetail {
      private TbStudentDAO studentDAO;
      private TbStudent student;
      public TbStudent searchStudentInfo(int searchstuid){
    	  studentDAO=new TbStudentDAO();
  		  student=new TbStudent();			
		  student=studentDAO.findById(searchstuid);
		  
			return student;
		
		}
	@Override
	public String toString() {
		return "AdminsearchStuDetail [student=" + student + "]";
	}
      

   }
