package com.chan.hub.boj.enums

import org.springframework.http.HttpStatus

enum class ExceptionCode (val status: HttpStatus, val code : String, val message: String){
    PROBLEM_NOT_FOUND(HttpStatus.NOT_FOUND, "COMMON-001", "문제 풀이를 찾을 수 없습니다."),
    SCRAPING_ERROR(HttpStatus.NOT_FOUND, "COMMON-002", "데이터를 가져오는 것을 실패하였습니다."),
}