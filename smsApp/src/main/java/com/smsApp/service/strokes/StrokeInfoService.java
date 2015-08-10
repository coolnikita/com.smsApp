package com.smsApp.service.strokes;

import java.util.List;

import com.smsApp.model.StrokeInfo;

public interface StrokeInfoService {

	public void addStrokeInfo(StrokeInfo info);
	
	public void updateStrokeInfo(StrokeInfo info);
	
	public StrokeInfo getStrokeInfo(int id);
	
	public void deleteStrokeInfo(int id);
	
	public List<StrokeInfo> getAllStrokeInfo();
	
}
