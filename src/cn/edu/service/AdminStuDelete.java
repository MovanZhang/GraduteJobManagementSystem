package cn.edu.service;

import cn.edu.dao.TbStudentDAO;
import cn.edu.dao.TbStujobDAO;
import cn.edu.entity.TbStudent;
import cn.edu.entity.TbStujob;



public class AdminStuDelete {
	  private TbStudent tbstudent;
      private TbStudentDAO tbstudentDAO=new TbStudentDAO();
	  public TbStudent getTbstudent() {
		return tbstudent;
	}
	  public void setTbstudent(TbStudent tbstudent) {
		this.tbstudent = tbstudent;
	}
	public TbStudentDAO getTbstudentDAO() {
		return tbstudentDAO;
	}
	  public void setTbstudentDAO(TbStudentDAO tbstudentDAO) {
		this.tbstudentDAO = tbstudentDAO;
	}
	  public TbStudent findStudent(int id){
			try{
				tbstudent=new TbStudent();
				tbstudent=tbstudentDAO.findById(id);
				return tbstudent;
			}catch(Throwable te){
				System.err.println(this.getClass() + " ERROR:²éÕÒ³ö´í£¡ ");
				te.printStackTrace();
				return tbstudent=null;
			}
		} 
    public boolean deleteStudent(TbStudent student){
    	
    	try{
    		tbstudentDAO.delete(student);
    		return true;
    	}catch(Throwable te){
    		System.err.println(this.getClass() + " ERROR: ");
			te.printStackTrace();
			return false; 		
    	}   	
    }  
}
