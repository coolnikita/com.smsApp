package com.smsApp.dao.ageGroup;

import java.util.List;
import com.smsApp.model.AgeGroup;

public interface AgeGroupDAO {
	public void addAgeGroup(AgeGroup info);

	public void updateAgeGroup(AgeGroup info);
	
	public AgeGroup getAgeGroup(String grpName);
	
	public void deleteAgeGroup(String grpName);
	
	public List<AgeGroup> getAllAgeGroups();
}
