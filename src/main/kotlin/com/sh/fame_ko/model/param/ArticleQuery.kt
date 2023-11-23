package com.sh.fame_ko.model.param

import com.sh.fame_ko.model.enum.ArticleStatus

data class ArticleQuery (
    val title : String,
    val status : ArticleStatus,
    val priority : Int,
    var listShow : Boolean,
    var headerShow : Boolean
)