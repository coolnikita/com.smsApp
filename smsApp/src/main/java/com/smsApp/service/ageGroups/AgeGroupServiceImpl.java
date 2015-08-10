package com.smsApp.service.ageGroups;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smsApp.dao.ageGroup.AgeGroupDAO;
import com.smsApp.model.AgeGroup;

@Service
@Transactional
public class AgeGroupServiceImpl implements AgeGroupService {

	@Autowired
	private AgeGroupDAO ageDao ;
	
	public void addAgeGroup(AgeGroup info) {
		ageDao.addAgeGroup(info);
	}

	public void updateAgeGroup(AgeGroup info) {
		ageDao.updateAgeGroup(info);
	}

	public AgeGroup getAgeGroup(String grpName) {
		return ageDao.getAgeGroup(grpName);
	}

	public void deleteAgeGroup(String grpName) {
		ageDao.deleteAgeGroup(grpName);
	}

	public List<AgeGroup> getAllAgeGroups() {
		return ageDao.getAllAgeGroups();
	}

}
