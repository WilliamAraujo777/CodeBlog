package com.spring.codeblog.repository;
import com.spring.codeblog.model.Publicacao;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Publicacao, Long> {
 
}
