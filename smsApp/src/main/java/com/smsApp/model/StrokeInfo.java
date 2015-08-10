package com.smsApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stroke_info")
public class StrokeInfo {
	
	@Id
	@GeneratedValue
	@Column(name="stroke_id")
	private Integer strokeId;	
	
	@Column(name="stroke_name")
	private String strokeName;
	
	@Column(name="distance_in_mts")
	private String distanceInMts;
	
	
	public Integer getStrokeId() {
		return strokeId;
	}
	public void setStrokeId(Integer strokeId) {
		this.strokeId = strokeId;
	}
	public String getStrokeName() {
		return strokeName;
	}
	public void setStrokeName(String strokeName) {
		this.strokeName = strokeName;
	}
	public String getDistanceInMts() {
		return distanceInMts;
	}
	public void setDistanceInMts(String distanceInMts) {
		this.distanceInMts = distanceInMts;
	}
	
	
}
