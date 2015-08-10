package com.smsApp.dao.stroke;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.smsApp.model.StrokeInfo;

@Repository
public class StrokeInfoDAOImpl implements StrokeInfoDAO {

	private SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addStrokeInfo(StrokeInfo info) {
		getCurrentSession().save(info);		
	}

	public void updateStrokeInfo(StrokeInfo info) {
		StrokeInfo recToUpdate = getStrokeInfo(info.getStrokeId());
		recToUpdate.setStrokeName(info.getStrokeName());
		recToUpdate.setDistanceInMts(info.getDistanceInMts());
		getCurrentSession().update(recToUpdate);
	}

	public StrokeInfo getStrokeInfo(int id) {
		StrokeInfo info = (StrokeInfo) getCurrentSession().get(StrokeInfo.class, id);
		return info;
	}

	public void deleteStrokeInfo(int id) {
		StrokeInfo info = getStrokeInfo(id);
		if(info!=null)
			getCurrentSession().delete(info);		
	}

	@SuppressWarnings("unchecked")
	public List<StrokeInfo> getAllStrokeInfo() {
		return getCurrentSession().createQuery("from stroke_info").list();
	}

}
