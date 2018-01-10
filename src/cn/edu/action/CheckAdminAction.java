package cn.edu.action;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import cn.edu.entity.TbAdmin;
import cn.edu.service.CheckAdmin;

import com.opensymphony.xwork2.ActionSupport;
public class CheckAdminAction extends ActionSupport{
         private TbAdmin admin;
         private CheckAdmin checkAdmin;
         private String chknumber;     	
     	
     	public String getChknumber() {
     		return chknumber;
     	}
     	public void setChknumber(String chknumber) {
     		this.chknumber = chknumber;
     	}
		public TbAdmin getAdmin() {
			return admin;
		}
		public void setAdmin(TbAdmin admin) {
			this.admin = admin;
		}
		
		public CheckAdmin getCheckAdmin() {
			return checkAdmin;
		}
		public void setCheckAdmin(CheckAdmin checkAdmin) {
			this.checkAdmin = checkAdmin;
		}
		@Override
		public String execute() throws Exception {
			checkAdmin= new CheckAdmin();
			Map<String, Object> session=ServletActionContext.getContext().getSession();
			session.get("randomCode").equals(chknumber);
			boolean  ch;
			ch=session.get("randomCode").equals(chknumber);
			boolean isTeacher=checkAdmin.checkAdminLogin(admin.getAdminId(), admin.getAdminPwd());
			if(isTeacher&&ch){
				return SUCCESS;
			}
			return INPUT;
		}         
}
