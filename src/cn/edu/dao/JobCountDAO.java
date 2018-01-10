package cn.edu.dao;

import java.util.List;
import org.hibernate.Query;

public class JobCountDAO extends BaseHibernateDAO {
	private int total;// 总人数
	private int total1;// 总就业人数
	private int mtotal;// 男生总人数
	private int mtotal1;// 男生就业总人数
	private int wtotal;// 女生总人数
	private int wtotal1;// 女生就业总人数
	private int graduation;// 毕业总人数
	private int jonGrad;// 就业总人数

	public int getGraduation() {
		return graduation;
	}

	public void setGraduation(int graduation) {
		this.graduation = graduation;
	}

	public int getJonGrad() {
		return jonGrad;
	}

	public void setJonGrad(int jonGrad) {
		this.jonGrad = jonGrad;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal1() {
		return total1;
	}

	public void setTotal1(int total1) {
		this.total1 = total1;
	}

	public int getMtotal() {
		return mtotal;
	}

	public void setMtotal(int mtotal) {
		this.mtotal = mtotal;
	}

	public int getMtotal1() {
		return mtotal1;
	}

	public void setMtotal1(int mtotal1) {
		this.mtotal1 = mtotal1;
	}

	public int getWtotal() {
		return wtotal;
	}

	public void setWtotal(int wtotal) {
		this.wtotal = wtotal;
	}

	public int getWtotal1() {
		return wtotal1;
	}

	public void setWtotal1(int wtotal1) {
		this.wtotal1 = wtotal1;
	}

	public void total(String str) {
		TbStudentDAO sd = new TbStudentDAO();
		List list = sd.findByStuGraUniversity(str);
		total = list.size();
		// System.out.println("总人数：" + total);
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i));
		// }

		String sql = "select count(stuName) from TbStudent st where st.stuGraUniversity=? and st.stuSex=?";
		Query query = getSession().createQuery(sql);
		query.setString(0, str);
		query.setString(1, "男");
		list = query.list();
		mtotal = Integer.parseInt(list.get(0).toString());
		// System.out.println("男生总人数：" +
		// Integer.parseInt(list.get(0).toString()));

		wtotal = total - mtotal;
		// System.out.println("女生总人数：" + wtotal);

		String sql1 = "select count(*) from TbStudent st where st.stuGraUniversity=? and st.stuSex=? and st.stuJob is not null";
		Query query1 = getSession().createQuery(sql1);
		query1.setString(0, str);
		query1.setString(1, "男");
		list = query1.list();
		mtotal1 = Integer.parseInt(list.get(0).toString());
		// System.out.println("男生就业人数：" + mtotal1);

		String sql2 = "select count(*) from TbStudent st where  st.stuGraUniversity=? and st.stuSex=? and st.stuJob is not null";
		Query query2 = getSession().createQuery(sql2);
		query2.setString(0, str);
		query2.setString(1, "女");
		list = query2.list();
		wtotal1 = Integer.parseInt(list.get(0).toString());
		// System.out.println("女生就业人数：" + wtotal1);

		total1 = mtotal1 + wtotal1;
		// System.out.println("就业总人数：" + total1);
	}

	public void count() {
		TbStudentDAO sd = new TbStudentDAO();
		List list = sd.findAll();
		graduation = list.size();
		// System.out.println("毕业总人数" + graduation);

		String sql3 = "select count(*) from TbStudent st where st.stuJob is not null";
		Query query3 = getSession().createQuery(sql3);
		list = query3.list();
		jonGrad = Integer.parseInt(list.get(0).toString());
		// System.out.println("全部就业人数：" + jonGrad);
	}
}