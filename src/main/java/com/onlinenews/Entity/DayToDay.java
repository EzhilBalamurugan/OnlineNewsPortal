package com.onlinenews.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="day_to_day")
public class DayToDay {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="day_id")
	private long id;
	
	@Column(name="day_to_day_news")
	private String dayToDayNews;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDayToDayNews() {
		return dayToDayNews;
	}

	public void setDayToDayNews(String dayToDayNews) {
		this.dayToDayNews = dayToDayNews;
	}

	@Override
	public String toString() {
		return "DayToDay [id=" + id + ", dayToDayNews=" + dayToDayNews + "]";
	}
	
	
	
}
