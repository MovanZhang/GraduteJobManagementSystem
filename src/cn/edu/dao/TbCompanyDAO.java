package cn.edu.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.entity.TbCompany;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbCompany entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.entity.TbCompany
 * @author MyEclipse Persistence Tools
 */

public class TbCompanyDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbCompanyDAO.class);
	// property constants
	public static final String COMP_USERNAME = "compUsername";
	public static final String COMP_PWD = "compPwd";
	public static final String COMP_NAME = "compName";
	public static final String COMP_PROPERTY = "compProperty";
	public static final String COMP_INDUSTRY = "compIndustry";
	public static final String COMP_SIZE = "compSize";
	public static final String COMP_ADDRESS = "compAddress";
	public static final String COMP_CON_PER = "compConPer";
	public static final String COMP_EMAIL = "compEmail";
	public static final String COMP_TEL = "compTel";
	public static final String COMP_ZIP_CODE = "compZipCode";
	public static final String COMP_INTRO = "compIntro";

	public void save(TbCompany transientInstance) {
		log.debug("saving TbCompany instance");
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

	public void delete(TbCompany persistentInstance) {
		log.debug("deleting TbCompany instance");
		Transaction tx = getSession().beginTransaction(); //
		try {
			getSession().delete(persistentInstance);
			System.out.println("delete successful");
			tx.commit(); //
		} catch (RuntimeException re) {
			System.err.println("delete failed");
			re.printStackTrace();
			tx.rollback();//
			throw re;
		} finally {

		}
	}

	public TbCompany findById(java.lang.Integer id) {
		log.debug("getting TbCompany instance with id: " + id);
		System.out.println("123445"+id);
		try {
			TbCompany instance = (TbCompany) getSession().get(
					"cn.edu.entity.TbCompany", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbCompany instance) {
		log.debug("finding TbCompany instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.entity.TbCompany")
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
		log.debug("finding TbCompany instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbCompany as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCompUsername(Object compUsername) {
		return findByProperty(COMP_USERNAME, compUsername);
	}

	public List findByCompPwd(Object compPwd) {
		return findByProperty(COMP_PWD, compPwd);
	}

	public List findByCompName(Object compName) {
		return findByProperty(COMP_NAME, compName);
	}

	public List findByCompProperty(Object compProperty) {
		return findByProperty(COMP_PROPERTY, compProperty);
	}

	public List findByCompIndustry(Object compIndustry) {
		return findByProperty(COMP_INDUSTRY, compIndustry);
	}

	public List findByCompSize(Object compSize) {
		return findByProperty(COMP_SIZE, compSize);
	}

	public List findByCompAddress(Object compAddress) {
		return findByProperty(COMP_ADDRESS, compAddress);
	}

	public List findByCompConPer(Object compConPer) {
		return findByProperty(COMP_CON_PER, compConPer);
	}

	public List findByCompEmail(Object compEmail) {
		return findByProperty(COMP_EMAIL, compEmail);
	}

	public List findByCompTel(Object compTel) {
		return findByProperty(COMP_TEL, compTel);
	}

	public List findByCompZipCode(Object compZipCode) {
		return findByProperty(COMP_ZIP_CODE, compZipCode);
	}

	public List findByCompIntro(Object compIntro) {
		return findByProperty(COMP_INTRO, compIntro);
	}

	public List findAll() {
		log.debug("finding all TbCompany instances");
		try {
			String queryString = "from TbCompany";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbCompany merge(TbCompany detachedInstance) {
		log.debug("merging TbCompany instance");
		try {
			Session session = getSession();
			Transaction tr = session.beginTransaction();
			TbCompany result = (TbCompany) getSession().merge(detachedInstance);
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

	public void attachDirty(TbCompany instance) {
		log.debug("attaching dirty TbCompany instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbCompany instance) {
		log.debug("attaching clean TbCompany instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}