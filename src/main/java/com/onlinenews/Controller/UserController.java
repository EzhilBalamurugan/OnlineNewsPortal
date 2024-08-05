package com.onlinenews.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.onlinenews.Entity.DayToDay;
import com.onlinenews.Entity.Political;
import com.onlinenews.Entity.Sports;
import com.onlinenews.Service.DayToDayServiceImpl;
import com.onlinenews.Service.PoliticalServiceImpl;
import com.onlinenews.Service.SportsServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private DayToDayServiceImpl day;
	@Autowired
	private PoliticalServiceImpl pol;
	@Autowired
	private SportsServiceImpl sports;
	
    @GetMapping("/UserDayToDayNews")
    public String getUserDayToDayNews(Model theModel) {

		List<DayToDay> dayToDay = day.getUserDayToDay();
		theModel.addAttribute("dayToDayNews",dayToDay);
		return "UserDayToDayNews";
    }
    
    @GetMapping("/UserPoliticalNews")
    public String getUserPoliticalNews(Model theModel) {
    	
    	List<Political> political = pol.getUserPolitical();
		theModel.addAttribute("politicalNews",political);
		return "UserPoliticalNews";
    }
	
    @GetMapping("/UserSportsNews")
    public String getUserSportNews(Model theModel) {
    	
    	List<Sports> sport = sports.getUserSports();
		theModel.addAttribute("sportsNews",sport);
		return "UserSportsNews";
    }
    
    //=============================================
    //User
    @GetMapping("/UserDashBoardRevert")
    public String getUser() {
    	return "UserDashBoard";
    }
    
    //Admin
    @GetMapping("/AdminDashBoardRevert")
    public String getAdmin() {
    	return "ViewNews";
    }
    //=============================================
    //Home page
    @GetMapping("/home")
    public String Home() {
    	return "index";
    }
    
    //=============================================
    
    //Admin Login
    @GetMapping("/Admin-Login")
    public String getAdminLogin() {
    	return "Admin-Login";
    }
    
    //User Login
    @GetMapping("/User-Login")
    public String getUserLogin() {
    	return "User-Login";
    }
}
