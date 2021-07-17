package com.spring.codeblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Publicacao;

public interface CodeBlogServices {
	
	List<Publicacao> findAll ();
	Publicacao findById(long id);
	Publicacao save(Publicacao pub);
	
}
