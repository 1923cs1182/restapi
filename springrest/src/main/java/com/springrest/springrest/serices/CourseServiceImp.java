package com.springrest.springrest.serices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entity.Load;


@Service
public class CourseServiceImp implements LoadService {
	@Autowired
    private LoadDao loadDao; 
	@Override
	public List<Load> getLoads() {
		return loadDao.findAll();
	}

	
	@Override
	public Load getLoad(String loadId) {
		return loadDao.getById(loadId);
	}

	@Override
	public void addLoad(Load load) {
		loadDao.save(load);
		
	}


	@Override
	public void deleteLoad(String loadId) {
		 Load entity=loadDao.getById(loadId);
		  loadDao.delete(entity);
		
	}

	
	

}
