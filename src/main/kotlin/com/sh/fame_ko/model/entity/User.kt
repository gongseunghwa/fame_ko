package com.sh.fame_ko.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "a_user")
class User(
    @Column(name = "user_name")
    var userName : String,

    @Column(name = "user_passwd")
    var password : String,

    @Column(name = "user_eamil")
    var email : String,

    @Column(name = "screen_name")
    var screenName : String,

    @Column(name = "logged")
    var logged : Date
) : BaseEntity() {

}
