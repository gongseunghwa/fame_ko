package com.sh.fame_ko.service

import com.sh.fame_ko.model.dto.ArticleDetailDto
import com.sh.fame_ko.model.param.ArticleQuery
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

@Service
interface ArticleService {
    fun pageArticleAdmin(page: Int, size : Int, query : ArticleQuery) : Page<ArticleDetailDto>?

}
