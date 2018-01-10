package cn.edu.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.entity.TbAdmin;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbAdmin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.entity.TbAdmin
 * @author MyEclipse Persistence Tools
 */

public class TbAdminDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbAdminDAO.class);
	// property constants
	public static final String ADMIN_ID = "adminId";
	public static final String ADMIN_PWD = "adminPwd";

	public void save(TbAdmin transientInstance) {
		log.debug("saving TbAdmin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbAdmin persistentInstance) {
		log.debug("deleting TbAdmin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbAdmin findById(java.lang.Integer id) {
		log.debug("getting TbAdmin instance with id: " + id);
		try {
			TbAdmin instance = (TbAdmin) getSession().get(
					"cn.edu.entity.TbAdmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbAdmin instance) {
		log.debug("finding TbAdmin instance by example");
		try {
			List results = getSession().createCriteria("cn.edu.entity.TbAdmin")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbAdmin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbAdmin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List findByAdminPwd(Object adminPwd) {
		return findByProperty(ADMIN_PWD, adminPwd);
	}

	public List findAll() {
		log.debug("finding all TbAdmin instances");
		try {
			String queryString = "from TbAdmin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbAdmin merge(TbAdmin detachedInstance) {
		log.debug("merging TbAdmin instance");
		try {
			TbAdmin result = (TbAdmin) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbAdmin instance) {
		log.debug("attaching dirty TbAdmin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbAdmin instance) {
		log.debug("attaching clean TbAdmin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}