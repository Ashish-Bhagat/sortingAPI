package com.inferrix.Sorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inferrix.Sorting.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
