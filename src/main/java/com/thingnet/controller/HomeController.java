package com.thingnet.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="index.do")
	public void index_jsp(Model model){
		model.addAttribute("liming", "黎明你好");  
	}
	
	/*@RequestMapping(value="/randomRes.do",method=RequestMethod.POST)
	public void randomRes(@RequestParam(value = "name", required = false) String resNames[],Model model){
		System.out.println(resNames);
		model.addAttribute("result", "黎明你好");  
	}*/
	
	
	@RequestMapping(value="/randomRes.do",method=RequestMethod.POST)
	public ModelAndView randomRes(HttpServletRequest request, HttpServletResponse response){
		String names[] = request.getParameterValues("name");
		int size  =names.length;
		Random random = new Random();
		int index = random.nextInt(size);
		String result  = names[index];
		request.setAttribute("result", result);
		ModelAndView model = new ModelAndView("index");
        return model;
	}
}
