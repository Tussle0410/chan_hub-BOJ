package com.chan.hub.boj.config.exception

data class BaseExceptionResponse(
    val code: String,
    val message: String
){
    constructor(baseException: BaseException): this(baseException.baseResponseCode.code, baseException.baseResponseCode.message)
}