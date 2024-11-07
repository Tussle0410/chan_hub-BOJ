package com.chan.hub.boj.info.port.`in`

import com.chan.hub.boj.info.domain.Info

interface InfoUseCase {
    fun findApplicationInfo() : Info
}