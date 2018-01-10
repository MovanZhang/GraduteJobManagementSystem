package cn.edu.service;

import java.util.ArrayList;
import cn.edu.dao.TbStudentDAO;
import cn.edu.entity.TbStudent;


public class StuUpdateResume {
	private TbStudent tbStudent;
	private TbStudentDAO tbStudentDAO;

	@SuppressWarnings("unchecked")
	public void updateStudentInfo(TbStudent student) {
		
		tbStudent = new TbStudent();
		tbStudentDAO = new TbStudentDAO();
		try {
			ArrayList<TbStudent> tbstudents = new ArrayList<TbStudent>();
			tbstudents = (ArrayList<TbStudent>) tbStudentDAO
					.findByStuId(student.getStuId());

			tbStudent = tbstudents.get(0);
			tbStudent.setStuId(student.getStuId());
			tbStudent.setStuName(student.getStuName());
			tbStudent.setStuSex(student.getStuSex());
			tbStudent.setStuNation(student.getStuNation());
			tbStudent.setStuPolitical(student.getStuPolitical());
			tbStudent.setStuIdNum(student.getStuIdNum());
			tbStudent.setStuGraUniversity(student.getStuGraUniversity());
			tbStudent.setStuMajor(student.getStuMajor());
			tbStudent.setStuAdmissionTime(student.getStuAdmissionTime());
			tbStudent.setStuEducation(student.getStuEducation());
			tbStudent.setStuGraduateTime(student.getStuGraduateTime());
			tbStudent.setStuEmail(student.getStuEmail());
			tbStudent.setStuTelephone(student.getStuTelephone());
			tbStudent.setStuAddress(student.getStuAddress());
			tbStudent.setStuEduBac(student.getStuEduBac());
			tbStudent.setStuLanAbi(student.getStuLanAbi());
			tbStudent.setStuExp(student.getStuExp());
			tbStudent.setStuProExp(student.getStuProExp());
			tbStudent.setStuRewPun(student.getStuRewPun());
			tbStudent.setStuCadres(student.getStuCadres());
			tbStudent.setStuSelEev(student.getStuSelEev());
			tbStudent.setStuSpe(student.getStuSpe());
			// student更新会级联更新外键关联的表，如果它们的值变化了的话
			tbStudentDAO.merge(tbStudent);
		} finally {

		}
	}
}
