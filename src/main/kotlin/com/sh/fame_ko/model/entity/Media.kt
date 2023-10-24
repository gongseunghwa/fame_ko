package com.sh.fame_ko.model.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "media")
class Media(
    @Column(name = "media_name")
    private var name : String,

    @Column(name = "media_url")
    private var url : String,

    @Column(name = "thumb_url")
    private var thumbURL : String,

    @Column(name = "suffix")
    private var suffix : String
) : BaseEntity() {
}