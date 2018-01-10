package cn.edu.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.entity.TbStudent;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbStudent entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.entity.TbStudent
 * @author MyEclipse Persistence Tools
 */

public class TbStudentDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbStudentDAO.class);
	// property constants
	public static final String STU_ID = "stuId";
	public static final String STU_PWD = "stuPwd";
	public static final String STU_NAME = "stuName";
	public static final String STU_SEX = "stuSex";
	public static final String STU_NATION = "stuNation";
	public static final String STU_POLITICAL = "stuPolitical";
	public static final String STU_ID_NUM = "stuIdNum";
	public static final String STU_GRA_UNIVERSITY = "stuGraUniversity";
	public static final String STU_MAJOR = "stuMajor";
	public static final String STU_EDUCATION = "stuEducation";
	public static final String STU_ADMISSION_TIME = "stuAdmissionTime";
	public static final String STU_GRADUATE_TIME = "stuGraduateTime";
	public static final String STU_EMAIL = "stuEmail";
	public static final String STU_TELEPHONE = "stuTelephone";
	public static final String STU_ADDRESS = "stuAddress";
	public static final String STU_EDU_BAC = "stuEduBac";
	public static final String STU_LAN_ABI = "stuLanAbi";
	public static final String STU_EXP = "stuExp";
	public static final String STU_PRO_EXP = "stuProExp";
	public static final String STU_REW_PUN = "stuRewPun";
	public static final String STU_CADRES = "stuCadres";
	public static final String STU_SEL_EEV = "stuSelEev";
	public static final String STU_SPE = "stuSpe";
	public static final String STU_JOB = "stuJob";
	public static final String STU_COMP = "stuComp";

	public void save(TbStudent transientInstance) {
		log.debug("saving TbStudent instance");
		try {
			Session session = getSession();
			Transaction tr = session.beginTransaction();
			session.save(transientInstance);
			tr.commit();
			session.flush();
			session.close();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbStudent persistentInstance) {
		Transaction tx = getSession().beginTransaction();
		log.debug("deleting TbStudent instance");
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

	public TbStudent findById(java.lang.Integer id) {
		log.debug("getting TbStudent instance with id: " + id);
		try {
			TbStudent instance = (TbStudent) getSession().get(
					"cn.edu.entity.TbStudent", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbStudent instance) {
		log.debug("finding TbStudent instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.entity.TbStudent")
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
		log.debug("finding TbStudent instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbStudent as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStuId(Object stuId) {
		return findByProperty(STU_ID, stuId);
	}

	public List findByStuPwd(Object stuPwd) {
		return findByProperty(STU_PWD, stuPwd);
	}

	public List findByStuName(Object stuName) {
		return findByProperty(STU_NAME, stuName);
	}

	public List findByStuSex(Object stuSex) {
		return findByProperty(STU_SEX, stuSex);
	}

	public List findByStuNation(Object stuNation) {
		return findByProperty(STU_NATION, stuNation);
	}

	public List findByStuPolitical(Object stuPolitical) {
		return findByProperty(STU_POLITICAL, stuPolitical);
	}

	public List findByStuIdNum(Object stuIdNum) {
		return findByProperty(STU_ID_NUM, stuIdNum);
	}

	public List findByStuGraUniversity(Object stuGraUniversity) {
		return findByProperty(STU_GRA_UNIVERSITY, stuGraUniversity);
	}

	public List findByStuMajor(Object stuMajor) {
		return findByProperty(STU_MAJOR, stuMajor);
	}

	public List findByStuEducation(Object stuEducation) {
		return findByProperty(STU_EDUCATION, stuEducation);
	}

	public List findByStuAdmissionTime(Object stuAdmissionTime) {
		return findByProperty(STU_ADMISSION_TIME, stuAdmissionTime);
	}

	public List findByStuGraduateTime(Object stuGraduateTime) {
		return findByProperty(STU_GRADUATE_TIME, stuGraduateTime);
	}

	public List findByStuEmail(Object stuEmail) {
		return findByProperty(STU_EMAIL, stuEmail);
	}

	public List findByStuTelephone(Object stuTelephone) {
		return findByProperty(STU_TELEPHONE, stuTelephone);
	}

	public List findByStuAddress(Object stuAddress) {
		return findByProperty(STU_ADDRESS, stuAddress);
	}

	public List findByStuEduBac(Object stuEduBac) {
		return findByProperty(STU_EDU_BAC, stuEduBac);
	}

	public List findByStuLanAbi(Object stuLanAbi) {
		return findByProperty(STU_LAN_ABI, stuLanAbi);
	}

	public List findByStuExp(Object stuExp) {
		return findByProperty(STU_EXP, stuExp);
	}

	public List findByStuProExp(Object stuProExp) {
		return findByProperty(STU_PRO_EXP, stuProExp);
	}

	public List findByStuRewPun(Object stuRewPun) {
		return findByProperty(STU_REW_PUN, stuRewPun);
	}

	public List findByStuCadres(Object stuCadres) {
		return findByProperty(STU_CADRES, stuCadres);
	}

	public List findByStuSelEev(Object stuSelEev) {
		return findByProperty(STU_SEL_EEV, stuSelEev);
	}

	public List findByStuSpe(Object stuSpe) {
		return findByProperty(STU_SPE, stuSpe);
	}

	public List findByStuJob(Object stuJob) {
		return findByProperty(STU_JOB, stuJob);
	}

	public List findByStuComp(Object stuComp) {
		return findByProperty(STU_COMP, stuComp);
	}

	public List findAll() {
		log.debug("finding all TbStudent instances");
		try {
			String queryString = "from TbStudent";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbStudent merge(TbStudent detachedInstance) {
		log.debug("merging TbStudent instance");
		try {
			Session session = getSession();
			Transaction tr = session.beginTransaction();
			TbStudent result = (TbStudent) getSession().merge(detachedInstance);
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

	public void attachDirty(TbStudent instance) {
		log.debug("attaching dirty TbStudent instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbStudent instance) {
		log.debug("attaching clean TbStudent instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}