package com.mywork.controller;

import java.io.IOException;
import java.util.List;


import com.mywork.dao.AvailableItemsDao;
import com.mywork.model.AvailableItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@Autowired
	AvailableItemsDao availableItemsDao;

	@RequestMapping(value="/")
	public ModelAndView test(@ModelAttribute("availableItems") AvailableItems availableItems) throws IOException{


		for (AvailableItems i:availableItemsDao.viewItems()) {
			System.out.println(i.getItemImage());

		}
		return new ModelAndView("home","availableItems",new AvailableItems());

	}

	@ModelAttribute("ItemList")
	public List<AvailableItems> getCollegeList() {
		return availableItemsDao.viewItems();
	}

	/*@RequestMapping(value="/" ,method = RequestMethod.GET )
	@ResponseBody
	public ModelAndView getHomePage(ModelAndView model , @ModelAttribute List<AvailableItems> availableItems) throws IOException{

		List<AvailableItems> items= availableItemsDao.viewItems();
		availableItems=availableItemsDao.viewItems();
		for (AvailableItems i:items) {
			System.out.println(i.getItemImage());

		}
		model.addObject(availableItems);

		model.setViewName("home");

		return new ModelAndView("home");

	}*/
	/*@RequestMapping(value="/getItems", produces ="application/json" ,method = RequestMethod.GET)
	public @ResponseBody List<AvailableItems> getShoppingItems(ModelAndView model) throws IOException{
		System.out.println("begin");
		List<AvailableItems> items= availableItemsDao.viewItems();
		for (AvailableItems i:items) {
			System.out.println(i.getItemImage());

		}



		//	System.out.println(jsonItems);
	//	System.out.println("done");
		model.addObject(items);
		//model.addObject("jsonit",items);




		return items;

	}*/


}
