package com.sh.fame_ko.repository.impl

import com.querydsl.jpa.hibernate.HibernateQueryFactory
import com.querydsl.jpa.impl.JPAQueryFactory
import com.sh.fame_ko.model.entity.Article
import com.sh.fame_ko.model.entity.QArticle
import com.sh.fame_ko.model.entity.QUser
import com.sh.fame_ko.model.enum.ArticleStatus
import com.sh.fame_ko.model.param.ArticleQuery
import com.sh.fame_ko.repository.ArticleRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.query.JpaQueryCreator
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class ArticleRepositoryImpl(
    @PersistenceContext val entityManager: EntityManager,
) {

    fun findArticleAdmin(pageRequest: PageRequest, query: ArticleQuery): Page<Article>? {
        var jqf = JPAQueryFactory(entityManager)

//        var article = QArticle.article
//        jqf.selectFrom(article)
//            .where(article.)
//
//        var user = QUser.user
//        user.
        return null
    }

}