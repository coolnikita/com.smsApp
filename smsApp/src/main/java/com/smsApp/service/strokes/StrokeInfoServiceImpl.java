package com.smsApp.service.strokes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smsApp.dao.stroke.StrokeInfoDAO;
import com.smsApp.model.StrokeInfo;

@Service
@Transactional
public class StrokeInfoServiceImpl implements StrokeInfoService {

	@Autowired
	private StrokeInfoDAO infoDao;
	
	public void addStrokeInfo(StrokeInfo info) {
		infoDao.addStrokeInfo(info);	
	}

	public void updateStrokeInfo(StrokeInfo info) {
		infoDao.updateStrokeInfo(info);
	}

	public StrokeInfo getStrokeInfo(int id) {
		StrokeInfo info = infoDao.getStrokeInfo(id);
		return info;
	}

	public void deleteStrokeInfo(int id) {
		infoDao.deleteStrokeInfo(id);
	}

	public List<StrokeInfo> getAllStrokeInfo() {
		List<StrokeInfo> infoList = infoDao.getAllStrokeInfo();
		return infoList;
	}

}
