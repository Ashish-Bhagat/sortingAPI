package com.inferrix.Sorting.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.inferrix.Sorting.model.Article;
import com.inferrix.Sorting.repository.ArticleRepository;


@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository repository;
	
	  // @PostConstruct
		public void initLoadToDB() {
			List<Article> articles = IntStream.rangeClosed(1, 100).mapToObj(i -> new Article("Artcle" + i, new Random().nextInt(100), new Random().nextInt(20000)))
		.collect(Collectors.toList());
			repository.saveAll(articles);
		}
	 
	 
	 public List<Article> findAllArticle() {
		 
		 return repository.findAll();
		 
	 }
	 
	 public List<Article> findArticleWithSorting(String field)
	 {
		 return repository.findAll(Sort.by(Sort.Direction.ASC, field));
	 }

}
