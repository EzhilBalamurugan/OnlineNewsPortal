package com.onlinenews.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlinenews.Entity.Sports;
import com.onlinenews.Service.SportsServiceImpl;

@Controller
public class SportsController {

	@Autowired
	private SportsServiceImpl sport;
	
	@GetMapping("/getSportsNews")
	public String getSportsNews(Model theModel) {
		
		List<Sports> sportsNews = sport.getSportsNews();
		theModel.addAttribute("sports",sportsNews);
		return "list-sports-news";
		
	}
	//-------------------------------------
	
	//Add news in the Sports Table
	@GetMapping("/addSportsNews")
	public String addSportsNews(Model theModel) {
		theModel.addAttribute("save",new Sports());
		return "addSportsNews";
	}
	
	//Posting the newly added news to the DataBase
	@PostMapping("/saveSportsNews")
	public String saveSportsNews(@ModelAttribute("save") Sports sports) {
		sport.saveSportsNews(sports);
		return "ViewNews";
		
	}
	
	//--------------------------------------
	
	//update
	@RequestMapping(value="/editSportsNews/{id}")
	public String edit(@PathVariable int id,Model m) {
		Optional<Sports> t = sport.getSportsNewsId(id);
		m.addAttribute("t",t);
		return "editSportsNews";
		
	}
	
	@PostMapping(value="/editSaveSportsNews")
	public String editSave(@ModelAttribute("t") Sports t){
		sport.updateNews(t);
		return "redirect:/ViewNews";
	}
	
	//-------------------------------------
	
	//delete
	@RequestMapping("/deleteSports/{id}")
	public String deleteSports(@PathVariable("id") long sports) {
		sport.deleteSportsNewsById(sports);
		return "Delete";	}
}
