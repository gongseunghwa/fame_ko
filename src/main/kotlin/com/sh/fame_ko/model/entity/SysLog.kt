package com.sh.fame_ko.model.entity

import com.sh.fame_ko.model.enum.LogType
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "sysLog")
class SysLog(

    @Column(name = "data")
    private var data : String,

    @Column(name = "message")
    private var message : String,

    @Column(name = "log_type")
    @Enumerated(EnumType.STRING)
    private var logType : LogType,

    @Column(name = "ip")
    private var ip : String,

    @ManyToOne(targetEntity = User::class , cascade = [CascadeType.REMOVE, CascadeType.PERSIST])
    private var userId : UUID
) : BaseEntity() {
}