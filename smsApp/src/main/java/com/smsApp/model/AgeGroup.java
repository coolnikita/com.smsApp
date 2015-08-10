package com.smsApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="age_group")
public class AgeGroup {
	@Id
	@GeneratedValue
	@Column(name="groupId")
	private Integer groupId;
	
	@Column(name="group_name")
	private String groupName;
	
	@Column(name="upper_age_limit")
	private Integer upperAgeLimit;
	
	@Column(name="lower_age_limit")
	private Integer lowerAgeLimit;
	
	
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer id) {
		this.groupId = id;
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getUpperAgeLimit() {
		return upperAgeLimit;
	}
	public void setUpperAgeLimit(Integer upperAgeLimit) {
		this.upperAgeLimit = upperAgeLimit;
	}
	public Integer getLowerAgeLimit() {
		return lowerAgeLimit;
	}
	public void setLowerAgeLimit(Integer lowerAgeLimit) {
		this.lowerAgeLimit = lowerAgeLimit;
	}
	
	
	
}
