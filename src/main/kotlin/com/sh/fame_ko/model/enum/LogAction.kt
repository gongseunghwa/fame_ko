package com.sh.fame_ko.model.enum

enum class LogAction(val msg :String) {
    SELECT("조회"), ADD("신규"), UPDATE("갱신"), DELETE("삭제"), SUCCESS("성공"), FAIL("실패")
}