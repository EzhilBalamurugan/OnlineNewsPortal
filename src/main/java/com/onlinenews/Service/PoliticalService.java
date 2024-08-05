package com.onlinenews.Service;

import java.util.List;
import java.util.Optional;

import com.onlinenews.Entity.Political;

public interface PoliticalService {

	//Admin
	List<Political> getPoliticalNews();
	Political savePoliticalNews(Political t);
	Optional<Political> getPoliticalNewsId(long id); 
	Political updateNews(Political t);
	void deletePoliticalNewsById(long id);
	
	//------------------------------
	
	//User
	List<Political> getUserPolitical();
}
