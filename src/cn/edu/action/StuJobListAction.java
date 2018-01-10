package cn.edu.action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.entity.TbJob;
import cn.edu.entity.TbStudent;
import cn.edu.service.StuJobList;
import cn.edu.service.StudentPreviewResume;

@SuppressWarnings("serial")
public class StuJobListAction extends ActionSupport {
	private TbStudent tbStudent;
	private StuJobList stuJobList;
	private List<TbJob> tbJobs;
	StudentPreviewResume studentPreviewResume;
	String stuId;

	int currentPage;
	int size;
	int count;
	int total;

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

	public StudentPreviewResume getStudentPreviewResume() {
		return studentPreviewResume;
	}

	public void setStudentPreviewResume(
			StudentPreviewResume studentPreviewResume) {
		this.studentPreviewResume = studentPreviewResume;
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

	public StuJobList getStuJobList() {
		return stuJobList;
	}

	public void setStuJobList(StuJobList stuJobList) {
		this.stuJobList = stuJobList;
	}

	public List<TbJob> getTbJobs() {
		return tbJobs;
	}

	public void setTbJobs(List<TbJob> tbJobs) {
		this.tbJobs = tbJobs;
	}

	public String execute() {
		tbStudent = new TbStudent();
		System.out.println(stuId);
		studentPreviewResume = new StudentPreviewResume();
		tbStudent = studentPreviewResume.findStuInfo(stuId);
		System.out.println("查询工作列表中学生的学号 " + tbStudent.getStuId());
		System.out.println("查询工作列表进入action层");
		List<TbJob> tbJobs1 = new ArrayList<TbJob>();

		
		stuJobList = new StuJobList();
		tbJobs1 = stuJobList.LoadStudent();
		tbJobs = new ArrayList<TbJob>();
		for (int i = 0; i < tbJobs.size(); i++) {
			System.out.println(tbJobs.get(i).getJobTitle());

		}
		System.out.println("Job集合的大小" + tbJobs.size());

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
		if (currentPage <= 1) {
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
