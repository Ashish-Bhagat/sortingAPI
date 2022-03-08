package com.inferrix.Sorting.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.inferrix.Sorting.model.Article;
import com.inferrix.Sorting.service.ArticleService;

@RestController
@RequestMapping("/stackInstance")
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	@GetMapping("allArticles")
	public List<Article> getArticle() {
		return service.findAllArticle();	
		
	}
	
	@GetMapping("/{field}")
	public List<Article> getArticlewithSort(@PathVariable String field) {
		List<Article> allArticles = service.findArticleWithSorting(field);
		return allArticles;
	}
	


}
