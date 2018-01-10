package cn.edu.service;

import java.util.ArrayList;

import cn.edu.dao.TbJobDAO;
import cn.edu.dao.TbStudentDAO;
import cn.edu.entity.TbJob;
import cn.edu.entity.TbStudent;

public class StuWriteJobInfo {
	private TbStudent tbStudent;
	private TbStudentDAO tbStudentDAO;

	@SuppressWarnings("unchecked")
	public void writeJobInfo(TbStudent student) {
		System.out.println("进入service层,传入参数" + student.getStuId());
		tbStudent = new TbStudent();
		tbStudentDAO = new TbStudentDAO();
		try {
			ArrayList<TbStudent> tbstudents = new ArrayList<TbStudent>();
			tbstudents = (ArrayList<TbStudent>) tbStudentDAO
					.findByStuId(student.getStuId());

			tbStudent = tbstudents.get(0);
			System.out.println(" 填写就业信息action中的自增编号" + tbStudent.getStuNum());
			tbStudent.setStuJob(student.getStuJob());
			tbStudent.setStuComp(student.getStuComp());
			System.out.println(" 填写就业信息action中的自增编号action中的传入学号" + student.getStuId());			
			// student更新会级联更新外键关联的表，如果它们的值变化了的话
			tbStudentDAO.merge(tbStudent);
		} finally {

		}
	}
	
}
