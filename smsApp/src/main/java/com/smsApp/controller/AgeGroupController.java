package com.smsApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smsApp.model.AgeGroup;
import com.smsApp.service.ageGroups.AgeGroupService;

@Controller
@ComponentScan("com.smsApp.service")
@RequestMapping(value="/ageGroup")
public class AgeGroupController {
	
	AgeGroupService ageService;
	
	@Autowired
	public void setAgeGroupService(AgeGroupService as){
		this.ageService = as;
	}
	
	@RequestMapping(value = "/ageGroups", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("ageGroup", new AgeGroup());
		model.addAttribute("listGroups", this.ageService.getAllAgeGroups());
		return "ageGroup";
	}
	
	//For add and update group both
	@RequestMapping(value= "/ageGroup/add", method = RequestMethod.POST)
	public String addAgeGroup(@ModelAttribute("ageGroup") AgeGroup ag){
		if(ag.getGroupName()!=null){
			ageService.updateAgeGroup(ag);
		}
		else{
			ageService.addAgeGroup(ag);
		}
		return "redirect:/ageGroup";
	}
	
	@RequestMapping(value="/removeGroup/{getGroupName}")
	public String deleteAgeGroup(@PathVariable("groupName") String grpName, Model model){
		model.addAttribute("ageGroup",ageService.getAgeGroup(grpName));
		model.addAttribute("listGroups", ageService.getAllAgeGroups());
		return "ageGroup"; 
	}

}
