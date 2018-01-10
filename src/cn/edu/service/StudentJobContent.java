package cn.edu.service;

import cn.edu.entity.TbJob;
import cn.edu.dao.*;
public class StudentJobContent {
	TbJob tbJob;
	TbJobDAO tbJobDao;
	
	public TbJob searchJobContent(int jobId){
		tbJobDao=new TbJobDAO();
		tbJob=new TbJob();	
		tbJob=tbJobDao.findById(jobId);
		return tbJob;
		
	}
	
}
