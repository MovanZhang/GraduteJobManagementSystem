package cn.edu.service;

import java.util.ArrayList;
import java.util.List;
import cn.edu.dao.TbStujobDAO;
import cn.edu.entity.TbJob;
import cn.edu.entity.TbStudent;
import cn.edu.entity.TbStujob;
import cn.edu.entity.TbStujobId;

//学生查看简历投递的action
public class StuResumeJobList {
	private TbStujobDAO tbStujobDao;
	private List<TbJob> tbJobs;
	private List<TbStujob> tbStujobs;

	@SuppressWarnings("unchecked")
	public List<TbJob> LoadJobList(TbStudent tbStudent) {
		tbJobs = new ArrayList<TbJob>();
		tbStujobDao = new TbStujobDAO();
		tbStujobs = new ArrayList<TbStujob>();
		TbStujobId tbStujobId = new TbStujobId();
		try {

			tbStujobs = (List<TbStujob>) tbStujobDao.findAll();
			System.out.println("查询学生简历投递的Service中 学生工作表的长度" + tbStujobs.size());
			for (int i = 0; i < tbStujobs.size(); i++) {
				tbStujobId = tbStujobs.get(i).getId();
				TbStudent comTbStudent = new TbStudent();
				comTbStudent = tbStujobId.getTbStudent();
				System.out.println("查看学生简历投递service层中学生的姓名"
						+ comTbStudent.getStuId() + comTbStudent.getStuName()
						+ "编号" + comTbStudent.getStuNum());
				System.out.println("查看学生简历投递service层中传入参数学生的姓名"
						+ tbStudent.getStuName());
				if (comTbStudent.equals(tbStudent)) {
					try {
						if (tbStujobId.getTbJob().getJobTitle() != null) {
							tbJobs.add(tbStujobId.getTbJob());
						}
					} catch (Exception e) {
						// TODO: handle exception
					}

				}
			}
			return tbJobs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
