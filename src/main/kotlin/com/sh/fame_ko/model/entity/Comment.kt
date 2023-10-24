package com.sh.fame_ko.model.entity

import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "comment")
class Comment(
    @OneToOne(targetEntity = Article::class, cascade = [CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE])
    private var articleId : UUID,

    @OneToOne(targetEntity = Comment::class)
    private var parentId : UUID,

    @Column(name = "content")
    private var content : String,

    @Column(name = "name")
    private var name : String,

    @Column(name = "email")
    private var email : String,

    @Column(name = "website")
    private var website : String,

    @Column(name = "agree")
    private var agree : Int,

    @Column(name = "disagree")
    private var disagree : Int,

    @Column(name = "ip")
    private var ip : String,

    @Column(name = "agent")
    private var agent : String
) : BaseEntity() {
}