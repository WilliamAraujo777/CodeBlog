package com.spring.codeblog.controller;


import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.codeblog.model.Publicacao;
import com.spring.codeblog.service.CodeBlogServices;

@Controller
public class CodeBlogController {
	
	@Autowired
	CodeBlogServices codeBlogServices;
	
	@RequestMapping(value = "/pubs", method = RequestMethod.GET)
	public ModelAndView getPubs() {
		ModelAndView mv = new ModelAndView("pubs");
		List<Publicacao> pubs = codeBlogServices.findAll();
		mv.addObject("pubs", pubs);
		return mv;
	}
	
	@RequestMapping(value = "/pubs/{id}", method = RequestMethod.GET)
	public ModelAndView getPubDetails(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("pubDetails");
		Publicacao pub = codeBlogServices.findById(id);
		mv.addObject("pub", pub);
		return mv;
	}
	
	@RequestMapping(value = "/newpub", method = RequestMethod.GET)
	public String getPubForm() {
		return "pubForm";
	}
	
	@RequestMapping(value = "/newpub", method = RequestMethod.POST)
	public String savePost(@Valid Publicacao pub, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return "redirect:/newpub";
		}
		
		pub.setData_pub(LocalDate.now());
		codeBlogServices.save(pub);
		return "redirect:/pubs";
		
	}
}
