package com.onlinenews.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")
public class Sports {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sp_id")
	private long id;
	
	@Column(name="sports_news")
	private String sportsNews;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSportsNews() {
		return sportsNews;
	}

	public void setSportsNews(String sportsNews) {
		this.sportsNews = sportsNews;
	}


	

}
