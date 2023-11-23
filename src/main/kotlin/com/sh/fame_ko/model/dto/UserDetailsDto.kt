package com.sh.fame_ko.model.dto

import lombok.AllArgsConstructor
import lombok.Data
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails

@AllArgsConstructor
@Data
class UserDetailsDto(
    var user: com.sh.fame_ko.model.entity.User,
    var authorityList: Collection<GrantedAuthority?>?
) : UserDetails {

    override fun getAuthorities(): Collection<GrantedAuthority?>? {
        return authorityList
    }

    override fun getPassword(): String {
        return user.password
    }

    override fun getUsername(): String {
        return user.userName
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}