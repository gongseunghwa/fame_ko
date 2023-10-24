package com.sh.fame_ko.model.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "sys_option")
class SysOption(
    @Column(name = "option_key")
    private var optionKey : String,

    @Column(name = "option_value")
    private var optionValue : String
) : BaseEntity() {
}