package com.sh.fame_ko.repository

import com.github.f4b6a3.ulid.Ulid
import com.sh.fame_ko.model.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<Comment,Ulid> {
}