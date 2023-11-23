package com.sh.fame_ko.repository

import com.github.f4b6a3.ulid.Ulid
import com.sh.fame_ko.model.entity.SysOption
import org.springframework.data.jpa.repository.JpaRepository

interface SysOptionRepository : JpaRepository<SysOption, Ulid> {
}