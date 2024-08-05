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

import com.onlinenews.Entity.DayToDay;
import com.onlinenews.Service.DayToDayServiceImpl;

@Controller
public class DayToDayController {

	@Autowired
	private DayToDayServiceImpl service;
	
	//Index page controllers for Admin and User
	@GetMapping("/ViewNews")
	public String ViewNews() {
		return "ViewNews";
	}
	
	@GetMapping("/AdminDashBoard")
	public String Admin() {
		return "AdminDashBoard";
	}
	
	@GetMapping("/UserDashBoard")
	public String User() {
		return "UserDashBoard";
	}
	
	//-------------------------------------
	
	//Get All news in the DayToDay
	@GetMapping("/getDayToDayNews")
	public String getDayToDayNews(Model theModel){
		
		List<DayToDay> dayToDay = service.getDayToDayNews();
		theModel.addAttribute("dayToDayNews",dayToDay);
		return "list-daytoday-news";
	}
	
	//---------------------------------------
	
	//Add News in the DayToDay table
	@GetMapping("/addDayToDayNews")
	public String addDayToDayNews(Model theModel) {
		theModel.addAttribute("save", new DayToDay());
		return "addDayToDayNews";
	}
	
	//Add News in the DayToDay table
	@PostMapping("/saveDayToDayNews")
	public String saveDayToDayNews(@ModelAttribute("save") DayToDay day,Model theModel) {
		 service.saveDayToDayNews(day);
		 return "ViewNews";
	}
	
	//---------------------------------------
	
	//Update
	@RequestMapping(value="/editDayToDayNews/{id}")
	public String edit(@PathVariable int id, Model m){
		Optional<DayToDay> t=service.getDayToDayNewsId(id);    //getting News by ID
		m.addAttribute("t",t);
		return "editDayToDayNews";
	}
	 @PostMapping(value="/editsaveDayToDayNews")
		public String editSave(@ModelAttribute("t") DayToDay t){
			service.updateNews(t);
			return "ViewNews";
		}
	
	 //----------------------------------------
	 
	 //Delete
	 @RequestMapping("/deleteDayToDay/{id}")
	    public String deleteDayToDayNewsById(@PathVariable("id") long dayToDay)
	    {
	        service.deleteDayToDayNewsById(dayToDay);
	        return "Delete";
	    }
}
