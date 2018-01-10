package cn.edu.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.dao.TbJobDAO;
import cn.edu.entity.TbCompany;
import cn.edu.entity.TbJob;

public class CompanyManageJob {

	@SuppressWarnings("unchecked")
	
	public List<TbJob> findJobList(TbCompany company) {
			System.out.println("公司查找所有的招聘信息公司用户名"+company.getCompUsername());
			TbJobDAO tbJobDAO = new TbJobDAO();
			List<TbJob> tbJobs1 = new ArrayList<TbJob>();
			List<TbJob> tbJobs = new ArrayList<TbJob>();
			tbJobs1 = tbJobDAO.findAll();
			
			
			TbCompany tbCompany=new TbCompany();
			for (int i = 0; i < tbJobs1.size(); i++) {
				TbJob tbJob = new TbJob();
				tbJob = tbJobs1.get(i);
				
				tbCompany=(TbCompany)tbJob.getTbCompany();
				System.out.println(tbCompany.getCompId());
				if (tbCompany.equals(company)) {
					tbJobs.add(tbJob);
				}
				System.out.println(tbJob.getJobTitle()+tbJob.getTbCompany().getCompUsername());
			}
			return tbJobs;
		
		
	}
	
	public TbJob findOne(int jobId){
		TbJobDAO tbJobDAO = new TbJobDAO();
		return tbJobDAO.findById(jobId);
	}
	
	public List<TbJob> insertJob(TbJob tbJob){
		
		TbJobDAO tbJobDAO = new TbJobDAO();
		tbJobDAO.save(tbJob);
		
		TbCompany company=new TbCompany();
		company=tbJob.getTbCompany();
		System.out.println("插入JobSERvice层中公司的用户名"+company.getCompUsername());
		List<TbJob> tbJobs1 = new ArrayList<TbJob>();
		List<TbJob> tbJobs = new ArrayList<TbJob>();
		tbJobs1 = tbJobDAO.findAll();
		for (int i = 0; i < tbJobs1.size(); i++) {
			TbJob tbJobt = new TbJob();
			tbJobt = tbJobs1.get(i);
			if (tbJobt.getTbCompany().equals(company)) {
				tbJobs.add(tbJobt);
			}
		}
		return tbJobs;		
	}
	
	public void deleteJob(int jobId){
		TbJob tbJob=new TbJob();
		TbJobDAO tbJobDAO = new TbJobDAO();
		tbJob=tbJobDAO.findById(jobId);
		System.out.println("公司删除职位信息的ID"+tbJob.getJobId());
		tbJobDAO.delete(tbJob);
	}
	
public List<TbJob> updateJob(TbJob tbJob){
		
		TbJobDAO tbJobDAO = new TbJobDAO();
		tbJobDAO.merge(tbJob);
		
		TbCompany company=new TbCompany();
		company=tbJob.getTbCompany();
		System.out.println("插入JobSERvice层中公司的用户名"+company.getCompUsername());
		List<TbJob> tbJobs1 = new ArrayList<TbJob>();
		List<TbJob> tbJobs = new ArrayList<TbJob>();
		tbJobs1 = tbJobDAO.findAll();
		for (int i = 0; i < tbJobs1.size(); i++) {
			TbJob tbJobt = new TbJob();
			tbJobt = tbJobs1.get(i);
			if (tbJobt.getTbCompany().equals(company)) {
				tbJobs.add(tbJobt);
			}
		}
		return tbJobs;		
	}
}
