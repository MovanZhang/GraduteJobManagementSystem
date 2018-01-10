package cn.edu.service;

import java.util.ArrayList;
import cn.edu.dao.TbStudentDAO;
import cn.edu.entity.TbStudent;


public class StudentPreviewResume {
	
	TbStudentDAO tbStudentDao;
	TbStudent tbStudent;
	@SuppressWarnings("unchecked")
	public TbStudent findStuInfo(String stuId) {
		// TODO Auto-generated method stub
		tbStudentDao=new TbStudentDAO();
		tbStudent=new TbStudent();
		
		try{
			System.out.println("我要开始查询了");
			//tbStudent=(TbStudent) s.get(TbStudent.class, 1);
			ArrayList<TbStudent> tbstudents = new ArrayList<TbStudent>();
			tbstudents = (ArrayList<TbStudent>) tbStudentDao.findByStuId(stuId);
			tbStudent = tbstudents.get(0);
			//System.out.println(tbStudent.getStuName()+" "+tbStudent.getStuNum());
			return tbStudent;
		}finally{
		}
	}
}
