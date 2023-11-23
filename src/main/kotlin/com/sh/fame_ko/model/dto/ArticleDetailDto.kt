package com.sh.fame_ko.model.dto

import com.sh.fame_ko.model.entity.Article
import com.sh.fame_ko.model.entity.Category
import com.sh.fame_ko.model.entity.Tag
import com.sh.fame_ko.model.enum.ArticleStatus
import java.util.Date
import java.util.UUID

data class ArticleDetailDto(
    val id : UUID,
    val title : String,
    val content : String,
    val contentHtml : String,
    val authorId : Int,
    val hits : Int,
    val status : ArticleStatus,
    val listShow : Boolean,
    val headerShow : Boolean,
    val priority : Int,
    val allowComment : Boolean,
    val commentCount : Long,
    val category: Category,
    val tags : List<Tag>,
    val publishTime : Date
) {
    companion object {
        fun toDto(article:Article) : ArticleDetailDto {
            return ArticleDetailDto(article.id, article.title, article.content, article  )
        }
    }
}