package com.thingnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="index.do")
	public void index_jsp(Model model){
		model.addAttribute("liming", "黎明你好");  
	}
}
