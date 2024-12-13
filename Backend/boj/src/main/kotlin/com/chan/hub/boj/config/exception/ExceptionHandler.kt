package com.chan.hub.boj.config.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(BaseException::class)
    protected fun handleBaseException(baseException: BaseException): ResponseEntity<BaseExceptionResponse> {
        return ResponseEntity.status(baseException.baseResponseCode.status)
            .body(BaseExceptionResponse(baseException))
    }
}