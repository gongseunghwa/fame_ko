package com.sh.fame_ko.model.entity

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tag")
class Tag(
    @ManyToOne(targetEntity = Article::class)
    private var articleId : UUID,

    @Column(name = "name")
    private var name : String
) : BaseEntity() {
}