package com.sh.fame_ko.util

class CommonUtils {
    companion object {

        fun <T> success(response: T): ApiResult<T>? = ApiResult(true, response, null)

        fun error(throwable: Throwable) : ApiResult<*>? = ApiResult(false, null, ApiError(throwable))

        fun error(message: String?) : ApiResult<*>? = ApiResult(false,null,ApiError(message))

        class ApiResult<T>  constructor(val isSuccess: Boolean, val response: T, val error: ApiError?) {
            override fun toString(): String {
                return "ApiResult{" +
                        "success=" + isSuccess +
                        ", response=" + response +
                        ", error=" + error +
                        '}'
            }
        }

        class ApiError constructor(val message: String?) {

            constructor(throwable: Throwable) : this(throwable.message)

            override fun toString(): String {
                return "ApiError{" +
                        "message='" + message + '\'' +
                        '}'
            }
        }

    }

}