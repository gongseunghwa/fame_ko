package com.sh.fame_ko.service.impl

import com.sh.fame_ko.model.dto.ArticleDetailDto
import com.sh.fame_ko.model.entity.Article
import com.sh.fame_ko.model.param.ArticleQuery
import com.sh.fame_ko.repository.ArticleRepository
import com.sh.fame_ko.service.ArticleService
import com.vladsch.flexmark.util.format.Sort
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort.Direction
import org.springframework.stereotype.Service

@Service
@Slf4j
class ArticleServiceImpl(
    @Autowired private val articleRepository: ArticleRepository
) : ArticleService {
    override fun pageArticleAdmin(page: Int, size: Int, query: ArticleQuery): Page<ArticleDetailDto>? {
        var pageRequest = PageRequest.of(page, size)
        var articles = articleRepository.findArticleAdmin(pageRequest, query)
        return null
    }

}