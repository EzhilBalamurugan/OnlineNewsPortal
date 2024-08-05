package com.onlinenews.Service;

import java.util.List;
import java.util.Optional;

import com.onlinenews.Entity.DayToDay;


public interface DayToDayService {

	//Admin Part
	List<DayToDay> getDayToDayNews();
	DayToDay saveDayToDayNews(DayToDay day);
	Optional<DayToDay> getDayToDayNewsId(long id); 
	DayToDay updateNews(DayToDay t);
	void deleteDayToDayNewsById(long id);
	
	//----------------------------
	
	//User Part
	List<DayToDay> getUserDayToDay();
}
