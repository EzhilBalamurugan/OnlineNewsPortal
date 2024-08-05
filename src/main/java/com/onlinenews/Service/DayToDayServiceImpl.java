package com.onlinenews.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinenews.Entity.DayToDay;
import com.onlinenews.Repository.DayToDayRepo;

@Service
@Transactional
public class DayToDayServiceImpl implements DayToDayService {

	@Autowired
	private DayToDayRepo repo;
	
	//Admin part
	@Override
	public List<DayToDay> getDayToDayNews() {
       return  (List<DayToDay>) repo.findAll();
        
	}

   //----------------------------------
	//Add news
	@Override
	public DayToDay saveDayToDayNews(DayToDay day) {
		
		return repo.save(day);
	}

   //--------------------------------------
   //Update News
	@Override
	public Optional<DayToDay> getDayToDayNewsId(long id) {
		return repo.findById(id);
	}
	
    @Override
	public DayToDay updateNews(DayToDay t) {
		return repo.save(t);
	}
    
    //-----------------------------------
    //delete
	public void deleteDayToDayNewsById(long id) {
		
		 repo.deleteById(id);
	}

	//=======================================
	
	//UserPart
	@Override
	public List<DayToDay> getUserDayToDay() {
		 return  (List<DayToDay>) repo.findAll();
	}

}
