package cn.edu.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.entity.TbPolicy;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbPolicy entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.entity.TbPolicy
 * @author MyEclipse Persistence Tools
 */

public class TbPolicyDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbPolicyDAO.class);
	// property constants
	public static final String POLICY_TITLE = "policyTitle";
	public static final String POLICY_CON = "policyCon";

	public void save(TbPolicy transientInstance) {
		Transaction tx = getSession().beginTransaction();
		log.debug("saving TbPolicy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
			tx.commit();
		} catch (RuntimeException re) {
			log.error("save failed", re);
			tx.rollback();
			throw re;
		}
	}

	public void delete(TbPolicy persistentInstance) {
		Transaction tx = getSession().beginTransaction();
		log.debug("deleting TbPolicy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
			tx.commit();
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			tx.rollback();
			throw re;
		}
	}

	public TbPolicy findById(java.lang.Integer id) {
		log.debug("getting TbPolicy instance with id: " + id);
		try {
			TbPolicy instance = (TbPolicy) getSession().get(
					"cn.edu.entity.TbPolicy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPolicy instance) {
		log.debug("finding TbPolicy instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.entity.TbPolicy")
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
		log.debug("finding TbPolicy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbPolicy as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPolicyTitle(Object policyTitle) {
		return findByProperty(POLICY_TITLE, policyTitle);
	}

	public List findByPolicyCon(Object policyCon) {
		return findByProperty(POLICY_CON, policyCon);
	}

	public List findAll() {
		log.debug("finding all TbPolicy instances");
		try {
			String queryString = "from TbPolicy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPolicy merge(TbPolicy detachedInstance) {
		log.debug("merging TbPolicy instance");
		Transaction tx = getSession().beginTransaction();
		try {
			TbPolicy result = (TbPolicy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			tx.commit();
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			tx.rollback();
			throw re;
		}
	}

	public void attachDirty(TbPolicy instance) {
		log.debug("attaching dirty TbPolicy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPolicy instance) {
		log.debug("attaching clean TbPolicy instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}