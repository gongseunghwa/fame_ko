package com.sh.fame_ko.util

import lombok.Data

enum class ErrorCode(code: Int, s: String) {

    RUNTIME(1000, "RuntimeException"),
    NULL_POINTER(1001, "NullPointerException"),
    CLASS_CAST(1002, "ClassCastException"),
    IO(1003, "IOException"),
    NO_SUCH_METHOD(1004, "NoSuchMethodException"),
    INDEX_OUT_OF_BOUNDS(1005, "IndexOutOfBoundException"),
    METHOD_ARGUMENT_NOT_VALID(400, "METHOD_ARGUMENT_NOT_VALID"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    METHOD_BOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_LOGIN(999, "Not Login"),
    LOGIN_EXPIRE(998, "Login Expire")
}