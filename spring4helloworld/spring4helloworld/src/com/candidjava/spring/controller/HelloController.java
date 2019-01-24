package com.candidjava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("index")
	public ModelAndView sayHello() {
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg", "say hello from controller");
		return model;
	}

}
