package com.chan.hub.boj.config.exception

import com.chan.hub.boj.enums.ExceptionCode

class BaseException(exceptionCode: ExceptionCode): RuntimeException() {
    val baseResponseCode: ExceptionCode = exceptionCode
}