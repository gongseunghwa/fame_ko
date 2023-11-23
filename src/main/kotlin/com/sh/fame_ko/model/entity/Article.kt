package com.sh.fame_ko.model.entity

import com.sh.fame_ko.model.enum.ArticleStatus
import lombok.EqualsAndHashCode
import java.util.*
import javax.persistence.*

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
@NamedQueries(
    NamedQuery(name = "abc", query = "SELECT a FROM Article a"),
    NamedQuery(name = "aaa", query = "SELECT a FROM Article a ")
)
class Article(
    @Column(name = "title") var title : String,

    @Column(name = "content") var content : String,

    @OneToOne(targetEntity = User::class) var authorId : UUID,

    @Column(name = "hits") var hits : Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "article_status") var status : ArticleStatus,

    @Column(name = "list_show")  var listShow : Boolean,

    @Column(name = "header_show") var headerShow : Boolean,

    @Column(name = "priority") var priority : Int,

    @Column(name = "allow_comment") var allowComment : Boolean,

    @Column(name = "publish_time") var publishTime : Date,

    @Column(name = "tag_id")
    @OneToMany(targetEntity = Tag::class) var tagId : List<UUID>





) : BaseEntity()

