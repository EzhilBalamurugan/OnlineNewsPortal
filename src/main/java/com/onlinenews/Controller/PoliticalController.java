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


import com.onlinenews.Entity.Political;
import com.onlinenews.Service.PoliticalServiceImpl;

@Controller
public class PoliticalController {

	@Autowired
	private PoliticalServiceImpl political;
	
	//Get
	@GetMapping("/getPoliticalNews")
	public String getPoliticalNews(Model theModel) {
		
		List<Political> politicalnews = political.getPoliticalNews();
		theModel.addAttribute("political",politicalnews);
		return "list-political-news";
		
	}
	//-------------------------------------
	
	//add news in Political
	@GetMapping("addPoliticalNews")
	public String addPoliticalNews(Model theModel) {
		
		theModel.addAttribute("t", new Political());
		return "addPoliticalNews";
		
	}
	 @PostMapping("/savePoliticalNews")
		public String savePoliticalNews(@ModelAttribute("t") Political t,Model theModel){
			political.savePoliticalNews(t);
			return "ViewNews";
		}
	 //--------------------------------------
	 
	 //Update
	 @RequestMapping(value="/editPoliticalNews/{id}")
		public String edit(@PathVariable int id, Model m){
			Optional<Political> t=political.getPoliticalNewsId(id);    //getting News by ID
			m.addAttribute("t",t);
			return "editPoliticalNews";
		}
	 
	 @PostMapping(value="/editsavePoliticalNews")
		public String editSave(@ModelAttribute("t") Political t){
			political.updateNews(t);
			return "redirect:/ViewNews";
			}
	 
	 //--------------------------------------
	 
	 //Delete
	 @RequestMapping("/deletePoliticalNews/{id}")
	 public String deletePoliticalNewsById(@PathVariable("id") long politicalNews) {
		 political.deletePoliticalNewsById(politicalNews);
		 return "Delete";		 
	 }
	 
}
