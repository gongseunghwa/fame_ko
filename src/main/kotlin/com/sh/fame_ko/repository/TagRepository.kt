package com.sh.fame_ko.repository

import com.github.f4b6a3.ulid.Ulid
import com.sh.fame_ko.model.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository : JpaRepository<Tag, Ulid> {
}