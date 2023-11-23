package com.sh.fame_ko.repository

import com.github.f4b6a3.ulid.Ulid
import com.sh.fame_ko.model.entity.Article
import com.sh.fame_ko.model.param.ArticleQuery
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ArticleRepository : JpaRepository<Article,Ulid>{

    @Query("SELECT a FROM Article a " +
            "WHERE a.status = :#{query.status} AND a.priority = :#{query.priority} " +
            "AND a.title LIKE :#{query.title} AND a.listShow = :#{query.listShow} " +
            "AND a.headerShow = :#{query.headerShow}")
    fun findArticleAdmin(pageRequest: PageRequest, query : ArticleQuery) : Page<Article>?
}