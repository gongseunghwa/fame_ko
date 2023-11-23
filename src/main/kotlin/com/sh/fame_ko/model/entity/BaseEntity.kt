package com.sh.fame_ko.model.entity

import com.github.f4b6a3.ulid.UlidCreator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {

    @Id
    var id: UUID = UlidCreator.getMonotonicUlid().toUuid()
    @CreatedDate
    var created = Date()

    @LastModifiedDate
    protected var modified = Date()
    protected var deleted = 0

}


