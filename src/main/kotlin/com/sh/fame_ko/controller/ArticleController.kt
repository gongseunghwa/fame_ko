package com.sh.fame_ko.controller

import com.sh.fame_ko.model.dto.ArticleDetailDto
import com.sh.fame_ko.model.param.ArticleQuery
import com.sh.fame_ko.service.ArticleService
import com.sh.fame_ko.util.CommonUtils
import com.sh.fame_ko.util.CommonUtils.Companion.ApiResult
import com.sh.fame_ko.util.CommonUtils.Companion.success
import com.sh.fame_ko.util.FameConst
import com.sh.fame_ko.util.FameConst.Companion.DEFAULT_PAGE
import com.sh.fame_ko.util.FameConst.Companion.PAGE_SIZE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/admin/article")
class ArticleController (
    private val articleService : ArticleService
){

    @GetMapping
    fun page(@RequestParam(required = false, defaultValue = DEFAULT_PAGE) page : Int,
             @RequestParam(required = false, defaultValue = PAGE_SIZE) limit : Int,
             query : ArticleQuery
    ) : ApiResult<Page<ArticleDetailDto>>? {
        val articles : Page<ArticleDetailDto>? = articleService.pageArticleAdmin(page,limit,query)
        return success(articles!!)
    }
}