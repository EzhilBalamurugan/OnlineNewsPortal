package com.onlinenews.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="political")
public class Political {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pol_id")
	private long id;
	
	@Column(name="political_news")
	private String politicalNews;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPoliticalNews() {
		return politicalNews;
	}

	public void setPoliticalNews(String politicalNews) {
		this.politicalNews = politicalNews;
	}
	
}
