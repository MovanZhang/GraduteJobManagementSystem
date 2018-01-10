package cn.edu.action;

import java.util.ArrayList;
import java.util.List;

import cn.edu.service.adminExamJobList;

import cn.edu.entity.TbJob;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class JobContextAction extends ActionSupport {
	int currentPage;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	int count;
	int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	Integer id;
	private TbJob tbJob = new TbJob();

	public TbJob getTbJob() {
		return tbJob;
	}

	public void setTbJob(TbJob tbJob) {
		this.tbJob = tbJob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private List<TbJob> list = new ArrayList();

	public List<TbJob> getList() {
		return list;
	}

	public void setList(List<TbJob> list) {
		this.list = list;
	}

	public String find() {
		adminExamJobList job = new adminExamJobList();
		List<TbJob> list1 = new ArrayList<TbJob>();
		list1 = job.findAll();		
		count = list1.size();
		if (count==0){
			System.out.println("count==0");
			return "toJobList";
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
			if(m<list1.size()){
			list.add(list1.get(m));
			}
		}
		return "toJobList";
	}

	public String delect() {
		adminExamJobList job = new adminExamJobList();
		 System.out.println(id);
		tbJob = job.findById(id);
		// System.out.println(tbCompany.toString());
		job.delete(tbJob);
		find();
		return "jobList";
	}

	public String findOne() {
		adminExamJobList job = new adminExamJobList();
		tbJob = job.findById(id);
		return "toshowJob";
	}
}
