package com.smsApp.dao.ageGroup;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.smsApp.model.AgeGroup;

@Repository
public class AgeGroupDAOImpl implements AgeGroupDAO {

	private SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addAgeGroup(AgeGroup group) {
		getCurrentSession().save(group);
	}

	public void updateAgeGroup(AgeGroup info) {
		AgeGroup group = getAgeGroup(info.getGroupName());
		group.setGroupName(info.getGroupName());
		group.setLowerAgeLimit(info.getLowerAgeLimit());
		group.setUpperAgeLimit(info.getUpperAgeLimit());
		getCurrentSession().update(group);
	}

	public AgeGroup getAgeGroup(String grpName) {
		AgeGroup group = (AgeGroup) getCurrentSession().get(AgeGroup.class, grpName);
		return group;
	}

	public void deleteAgeGroup(String grpName) {
		AgeGroup group = getAgeGroup(grpName);
		if(group!=null)
			getCurrentSession().delete(group);
	}

	@SuppressWarnings("unchecked")
	public List<AgeGroup> getAllAgeGroups() {
		List<AgeGroup> listOfAgeGroups = getCurrentSession().createQuery("from age_group").list();
		return listOfAgeGroups;
	}
}
