package com.onlinenews.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinenews.Entity.DayToDay;
import com.onlinenews.Entity.Political;
import com.onlinenews.Repository.PoliticalRepo;

@Service
@Transactional
public class PoliticalServiceImpl implements PoliticalService {

	@Autowired
	private PoliticalRepo repo;
	
	
	//Admin Part
	@Override
	public List<Political> getPoliticalNews() {
		
		return (List<Political>) repo.findAll();
	}

	@Override
	public Political savePoliticalNews(Political t) {
		return repo.save(t);
	}

	@Override
	public Optional<Political> getPoliticalNewsId(long id) {
		return repo.findById(id);
	}

	@Override
	public Political updateNews(Political t) {
		return repo.save(t);
	}

	@Override
	public void deletePoliticalNewsById(long id) {
		repo.deleteById(id);
	}

	//----------------------------------
	
	//User Part
	@Override
	public List<Political> getUserPolitical() {
		return  repo.findAll();
	}

}
