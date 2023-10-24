package com.sh.fame_ko.model.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "category")
class Category(
    @OneToMany(targetEntity = Article::class)
    private var articleId : List<UUID>,
    @OneToOne(targetEntity = Category::class)
    private var parentId : Int,
    private var name : String
) : BaseEntity() {

}