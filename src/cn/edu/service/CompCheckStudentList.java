package cn.edu.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.dao.TbCompanyDAO;
import cn.edu.dao.TbJobDAO;
import cn.edu.dao.TbStujobDAO;
import cn.edu.entity.ComJobStu;
import cn.edu.entity.TbCompany;
import cn.edu.entity.TbJob;
import cn.edu.entity.TbStujob;
import cn.edu.entity.TbStujobId;

public class CompCheckStudentList {

	public List compCheckStuList(String compUserName) {
		TbCompany tbCompany;
		TbCompanyDAO tbCompanyDAO;
		tbCompany = new TbCompany();
		tbCompanyDAO = new TbCompanyDAO();
		ArrayList<TbCompany> tbCompanys = new ArrayList<TbCompany>();
		tbCompanys = (ArrayList<TbCompany>) tbCompanyDAO
				.findByCompUsername(compUserName);
		tbCompany = tbCompanys.get(0);
		int compId=tbCompany.getCompId();
		
		TbJobDAO tbJobDAO=new TbJobDAO();
		List<TbJob> tbJobs1 = new ArrayList<TbJob>();
		List<TbJob> tbJobs = new ArrayList<TbJob>();
		tbJobs1 = tbJobDAO.findAll();		
		TbCompany tbCompanyt=new TbCompany();
		for (int i = 0; i < tbJobs1.size(); i++) {
			TbJob tbJob = new TbJob();
			tbJob = tbJobs1.get(i);
			
			tbCompanyt=(TbCompany)tbJob.getTbCompany();
			System.out.println("公司查询学生中公司编号"+tbCompany.getCompId());
			if (tbCompanyt.equals(tbCompany)) {
				tbJobs.add(tbJob);
			}
			System.out.println(tbJob.getJobTitle()+tbJob.getTbCompany().getCompUsername());
		}
		
		ArrayList<Integer> jobListId=new ArrayList<Integer>();
		for (int i = 0; i < tbJobs.size(); i++) {
			jobListId.add(tbJobs.get(i).getJobId());
			System.out.println(tbJobs.get(i).getJobId());
		}
		
		TbStujobDAO tbStujobDAO=new TbStujobDAO();
		List<TbStujob> tbStujobs=new ArrayList<TbStujob>();
		tbStujobs=tbStujobDAO.findAll();
		
		List<ComJobStu> comJobStuList=new ArrayList<ComJobStu>();
		for (int i = 0; i < jobListId.size(); i++) {
			
			for (int j = 0; j < tbStujobs.size(); j++) {
				TbStujob tbStujob=new TbStujob();
				System.out.println("公司查看学生信息中的学生学号"+tbStujobs.get(j).getId().getTbStudent().getStuName());
				//tbStujob1=tbStujobIds.get(j);	
				
				if((jobListId.get(i))==(tbStujobs.get(j).getId().getTbJob().getJobId())){
					ComJobStu comJobStu=new ComJobStu();
					comJobStu.setJobTitle(tbStujobs.get(j).getId().getTbJob().getJobTitle());
					comJobStu.setStuName(tbStujobs.get(j).getId().getTbStudent().getStuName());
					comJobStu.setStuSex(tbStujobs.get(j).getId().getTbStudent().getStuSex());
					comJobStu.setStuMajor(tbStujobs.get(j).getId().getTbStudent().getStuMajor());
					comJobStu.setStuEducation(tbStujobs.get(j).getId().getTbStudent().getStuEducation());
					comJobStu.setStuId(tbStujobs.get(j).getId().getTbStudent().getStuId());
					comJobStuList.add(comJobStu);
				}
			}
			
			
		}
		
		return comJobStuList;
		/*TbStujobId tbStujobId = new TbStujobId();
		tbStujobId.setTbJob(tbJob);
		tbStujobId.setTbStudent(tbStudent);*/

	}
	
}
