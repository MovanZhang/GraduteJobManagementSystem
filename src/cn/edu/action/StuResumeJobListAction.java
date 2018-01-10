package cn.edu.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.entity.TbJob;
import cn.edu.entity.TbStudent;
import cn.edu.service.StuResumeJobList;
import cn.edu.service.StudentPreviewResume;

@SuppressWarnings("serial")
public class StuResumeJobListAction extends ActionSupport{
	private TbStudent tbStudent;
	private List<TbJob> tbJobs;
	StudentPreviewResume studentPreviewResume;
	String stuId;
    StuResumeJobList stuResumeJobList;
    
    int currentPage;
	int size;
	int count;
	int total;
	
	public StudentPreviewResume getStudentPreviewResume() {
		return studentPreviewResume;
	}
	public void setStudentPreviewResume(StudentPreviewResume studentPreviewResume) {
		this.studentPreviewResume = studentPreviewResume;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<TbJob> getTbJobs() {
		return tbJobs;
	}
	public void setTbJobs(List<TbJob> tbJobs) {
		this.tbJobs = tbJobs;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public TbStudent getTbStudent() {
		return tbStudent;
	}
	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}
	public StuResumeJobList getStuResumeJobList() {
		return stuResumeJobList;
	}
	public void setStuResumeJobList(StuResumeJobList stuResumeJobList) {
		this.stuResumeJobList = stuResumeJobList;
	}
	
	public String execute() throws Exception{
		tbStudent=new TbStudent();
		studentPreviewResume=new StudentPreviewResume();
		System.out.println("查看简历投递页面中的tbStudent的信息"+tbStudent.getStuId());
		System.out.println("查看简历投递页面中"+stuId);
		tbStudent=studentPreviewResume.findStuInfo(stuId);
		System.out.println("action+"+tbStudent.getStuName());
		System.out.println("查看简历投递页面中我要获取的信息是："+tbStudent.getStuName());
		
		List<TbJob> tbJobs1 = new ArrayList<TbJob>();
		tbJobs=new ArrayList<TbJob>();
		stuResumeJobList=new StuResumeJobList();
		
		tbJobs1=stuResumeJobList.LoadJobList(tbStudent);
		/*for(int i=0;i<tbJobs.size();i++){
			TbJob tbJob=new TbJob();
			tbJob=tbJobs.get(i);
			System.out.println("查询学生简历投递中Action层中简历编号"+tbJob.getJobTitle());
		}*/
		count = tbJobs1.size();
		
		if (count == 0) {
			return SUCCESS;
		}
		setSize(2);
		if (count % size != 0) {
			total = count / size + 1;
		} else {
			total = count / size;
		}
		if (currentPage <=1) {
			currentPage = 1;
		}
		if (currentPage > total) {
			currentPage = total;
		}

		for (int i = 0; i < size; i++) {
			int m;
			m = (getCurrentPage() - 1) * size + i;
			if(m<tbJobs1.size()){
			tbJobs.add(tbJobs1.get(m));
			}
		}
		return SUCCESS;
	}
}
