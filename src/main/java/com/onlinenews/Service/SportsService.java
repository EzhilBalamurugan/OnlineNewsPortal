package com.onlinenews.Service;

import java.util.List;
import java.util.Optional;

import com.onlinenews.Entity.Sports;

public interface SportsService {

	//Admin
	List<Sports> getSportsNews();
	Sports saveSportsNews(Sports sports);
	Optional<Sports> getSportsNewsId(long id); 
	Sports updateNews(Sports t);
	void deleteSportsNewsById(long id);
	
	//User
	List<Sports> getUserSports();
}
