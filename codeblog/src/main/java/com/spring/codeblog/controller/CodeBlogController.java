package com.spring.codeblog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codeblog.model.Publicacao;
import com.spring.codeblog.service.CodeBlogServices;

@Controller
public class CodeBlogController {
	
	@Autowired
	CodeBlogServices codeBlogServices;
	
	@RequestMapping(value = "/pubs", method = RequestMethod.GET)
	public ModelAndView getPubs() {
		
		ModelAndView mv = new ModelAndView("posts");
		List<Publicacao> pubs = codeBlogServices.findAll();
		mv.addObject("pubs", pubs);
		return mv;
	}
	
}
