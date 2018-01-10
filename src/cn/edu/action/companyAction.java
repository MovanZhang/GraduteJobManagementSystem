package cn.edu.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.mapping.Map;

import cn.edu.service.adminCompanyList;

import cn.edu.entity.TbCompany;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class companyAction extends ActionSupport {
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
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	Integer id;
	private TbCompany tbCompany = new TbCompany();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbCompany getTbCompany() {
		return tbCompany;
	}

	public void setTbCompany(TbCompany tbCompany) {
		this.tbCompany = tbCompany;
	}

	private List<TbCompany> list = new ArrayList();

	public List<TbCompany> getList() {
		return list;
	}

	public void setList(List<TbCompany> list) {
		this.list = list;
	}

	public String find() {
		adminCompanyList company = new adminCompanyList();
		List<TbCompany> list1 = new ArrayList();
		list1 = company.findAll();
		count = list1.size();
		if (count==0){
			return "toCompanyList";
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
		return "toCompanyList";
	}

	public String delect() {
		adminCompanyList company = new adminCompanyList();
		// System.out.println(id);
		tbCompany = company.findById(id);
		// System.out.println(tbCompany.toString());
		company.delete(tbCompany);
		System.out.println("++++++++++++++++");
		find();
		return "compList";
	}

	public String findOne() {
		adminCompanyList company = new adminCompanyList();
		tbCompany = company.findById(id);
		return "toshowCompany";
	}
}
