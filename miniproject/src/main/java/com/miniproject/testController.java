package com.miniproject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miniproject.model.FruitVO;
import com.miniproject.service.FruitService;

@Controller
public class testController {
	@Autowired
	 private FruitService service;
	@RequestMapping("/")
	public String index(Model model) {
		 ArrayList<FruitVO>fruList=service.listAllFruit();
		 model.addAttribute("fruList",fruList);
		return "index";
	}

	@RequestMapping("/detail")
	public String productDetailView() {
		return "product/productDetailView";
	}
}
