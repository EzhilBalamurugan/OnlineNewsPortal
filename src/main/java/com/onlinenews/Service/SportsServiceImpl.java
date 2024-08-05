package com.onlinenews.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinenews.Entity.DayToDay;
import com.onlinenews.Entity.Sports;
import com.onlinenews.Repository.SportsRepo;

@Service
@Transactional
public class SportsServiceImpl implements SportsService {

	@Autowired
	private SportsRepo repo;
	
	
	
	@Override
	public List<Sports> getSportsNews() {
		return (List<Sports>) repo.findAll();
	}

	//----------------------------------
	//Add news
	@Override
	public Sports saveSportsNews(Sports sports) {
		
		return repo.save(sports);
	}
	
   //----------------------------------------
   //Update News
	public Optional<Sports> getSportsNewsId(long id) {
		return repo.findById(id);
	}

	public Sports updateNews(Sports t) {
		return repo.save(t);
		
	}


	//-----------------------------------------
	//delete news
	@Override
	public void deleteSportsNewsById(long id) {
		repo.deleteById(id);
	}

	//=======================================
	
	//User Part
	@Override
	public List<Sports> getUserSports() {
		return  (List<Sports>) repo.findAll();
	}
	
}
