package cn.edu.service;

import java.util.ArrayList;
import java.util.List;
import cn.edu.dao.TbJobDAO;
import cn.edu.entity.TbJob;

public class StuJobList {
	private TbJobDAO jobDAO;
	private List<TbJob> tbJobs;
	
	@SuppressWarnings("unchecked")
	public List<TbJob> LoadStudent() {
		tbJobs=new ArrayList<TbJob>();
		jobDAO=new TbJobDAO();
		//Session s=null;
		
		try {
			//s=(Session) HibernateSessionFactory.getSession();
			System.out.println("学生查询工作列表进入SErvice");
			tbJobs=jobDAO.findAll();
			
			return tbJobs;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		}
	}

