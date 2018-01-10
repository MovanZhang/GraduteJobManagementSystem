package cn.edu.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.entity.TbStudent;
import cn.edu.entity.TbStujob;
import cn.edu.entity.TbStujobId;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbStujob entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.entity.TbStujob
 * @author MyEclipse Persistence Tools
 */

public class TbStujobDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbStujobDAO.class);

	// property constants

	public void save(TbStujob transientInstance) {
		log.debug("saving TbStujob instance");
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


	public void delete(TbStujob persistentInstance) {
		log.debug("deleting TbStujob instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbStujob findById(cn.edu.entity.TbStujobId id) {
		log.debug("getting TbStujob instance with id: " + id);
		try {
			TbStujob instance = (TbStujob) getSession().get(
					"cn.edu.entity.TbStujob", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbStujob instance) {
		log.debug("finding TbStujob instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.entity.TbStujob")
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
		log.debug("finding TbStujob instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbStujob as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TbStujob instances");
		try {
			String queryString = "from TbStujob";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbStujob merge(TbStujob detachedInstance) {
		log.debug("merging TbStujob instance");
		try {
			TbStujob result = (TbStujob) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbStujob instance) {
		log.debug("attaching dirty TbStujob instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbStujob instance) {
		log.debug("attaching clean TbStujob instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}