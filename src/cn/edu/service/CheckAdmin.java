package cn.edu.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.dao.TbAdminDAO;
import cn.edu.entity.TbAdmin;
import cn.edu.sessionfactory.HibernateSessionFactory;

import com.opensymphony.xwork2.ActionContext;

public class CheckAdmin {
	private ActionContext ctx;
	private TbAdminDAO adminDAO;
	private List<TbAdmin> admins;

	public boolean checkAdminLogin(String aNo, String aPassword) {
		adminDAO = new TbAdminDAO();
		admins = new ArrayList<TbAdmin>();
		try {
			System.out.println("管理员用户名：" + aNo);
			System.out.println("管理员用户名：" + aPassword);
			admins = adminDAO.findByAdminId(aNo);

			if (!admins.isEmpty()) {
				for (TbAdmin admin : admins) {
					if (admin.getAdminPwd().equals(aPassword)) {
						ctx = ActionContext.getContext();
						ctx.getSession().put("session_adminNo",
								admin.getAdminNum());
						ctx.getSession().put("session_adminId",
								admin.getAdminId());
						System.out.println("登录成功的管理员的用户名为："
								+ admin.getAdminId());
						return true;
					}
				}
			}
			return false;
		} catch (Throwable te) {
			System.err.println(this.getClass() + " ERROR: ");
			te.printStackTrace();
			return false;
		}
	}
}
