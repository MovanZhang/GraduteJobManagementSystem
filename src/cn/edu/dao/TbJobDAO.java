package cn.edu.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.entity.TbJob;

/**
 * A data access object (DAO) providing persistence and search support for TbJob
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.entity.TbJob
 * @author MyEclipse Persistence Tools
 */

public class TbJobDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbJobDAO.class);
	// property constants
	public static final String JOB_TITLE = "jobTitle";
	public static final String JOB_CON = "jobCon";

	public void save(TbJob transientInstance) {
		log.debug("saving TbJob instance");
		try {
			Session session = getSession();
			Transaction tr = session.beginTransaction();
			getSession().save(transientInstance);
			tr.commit();
			session.flush();
			session.close();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbJob persistentInstance) {
		log.debug("deleting TbJob instance");
		Transaction tx = getSession().beginTransaction();
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
			tx.commit();
		} catch (RuntimeException re) {
			re.printStackTrace();
			System.out.println("É¾³ýDAO²ã");
			log.error("delete failed", re);
			tx.rollback();
			throw re;
		}
	}

	public TbJob findById(java.lang.Integer id) {
		log.debug("getting TbJob instance with id: " + id);
		try {
			TbJob instance = (TbJob) getSession()
					.get("cn.edu.entity.TbJob", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbJob instance) {
		log.debug("finding TbJob instance by example");
		try {
			List results = getSession().createCriteria("cn.edu.entity.TbJob")
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
		log.debug("finding TbJob instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbJob as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJobTitle(Object jobTitle) {
		return findByProperty(JOB_TITLE, jobTitle);
	}

	public List findByJobCon(Object jobCon) {
		return findByProperty(JOB_CON, jobCon);
	}

	public List findAll() {
		log.debug("finding all TbJob instances");
		
		try {
			String queryString = "from TbJob";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} 
		 catch(Throwable te){
			 System.err.println(this.getClass()+" EROOR: ");
			 te.printStackTrace();
			 return null;
			 
		 }
		//catch (RuntimeException re) {
		//	log.error("find all failed", re);
		//	throw re;
	//	}
	}

	public TbJob merge(TbJob detachedInstance) {
		log.debug("merging TbJob instance");
		try {
			Session session = getSession();
			Transaction tr = session.beginTransaction();
			TbJob result = (TbJob) getSession().merge(detachedInstance);
			tr.commit();
			session.flush();
			session.close();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbJob instance) {
		log.debug("attaching dirty TbJob instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbJob instance) {
		log.debug("attaching clean TbJob instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}