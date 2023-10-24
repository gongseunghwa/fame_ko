package com.sh.fame_ko.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "a_user")
class User(
    @Column(name = "user_name")
    private var userName : String,

    @Column(name = "user_passwd")
    private var password : String,

    @Column(name = "user_eamil")
    private var email : String,

    @Column(name = "screen_name")
    private var screenName : String,

    @Column(name = "logged")
    private var logged : Date
) : BaseEntity() {

}
