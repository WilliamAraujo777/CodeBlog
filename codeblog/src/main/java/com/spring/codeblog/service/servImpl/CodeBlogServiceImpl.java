package com.spring.codeblog.service.servImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Publicacao;
import com.spring.codeblog.repository.CodeBlogRepository;
import com.spring.codeblog.service.CodeBlogServices;


@Service
public class CodeBlogServiceImpl implements CodeBlogServices{
	
	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	@Override
	public List<Publicacao> findAll() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Publicacao findById(long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Publicacao save(Publicacao pub) {
		return codeBlogRepository.save(pub);
	}
	
	

}
