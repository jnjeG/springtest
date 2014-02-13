package com.thingnet.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EncodingIntercepter extends HandlerInterceptorAdapter {
/*
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json"); 
	}
*/
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		 response.setCharacterEncoding("utf-8");
         response.setContentType("application/json");
		 return true;
	}

	
	
}
