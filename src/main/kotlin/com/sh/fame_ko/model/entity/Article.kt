package com.sh.fame_ko.model.entity

import com.sh.fame_ko.model.enum.ArticleStatus
import lombok.EqualsAndHashCode
import java.util.*
import javax.persistence.*

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
class Article(
    @Column(name = "title")
    private var title : String,

    @Column(name = "content")
    private var content : String,

    @OneToOne(targetEntity = User::class)
    private var authorId : UUID,

    @Column(name = "hits")
    private var hits : Int,

    @Enumerated(EnumType.STRING)
    private var status : ArticleStatus,

    @Column(name = "list_show")
    private var listShow : Boolean,

    @Column(name = "headr_show")
    private var headerShow : Boolean,

    @Column(name = "priority")
    private var priority : Int,

    @Column(name = "allow_comment")
    private var allowComment : Boolean,

    @Column(name = "publish_time")
    private var publishTime : Date,

    @Column(name = "tag_id")
    @OneToMany(targetEntity = Tag::class)
    private var tagId : List<UUID>,

    @ManyToOne(targetEntity = Category::class, cascade = [CascadeType.REMOVE])
    private var categoryId : UUID
) : BaseEntity()

