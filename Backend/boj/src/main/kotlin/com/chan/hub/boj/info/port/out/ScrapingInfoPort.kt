package com.chan.hub.boj.info.port.out

import com.chan.hub.boj.info.domain.Info

interface ScrapingInfoPort {
    fun findApplicationInfo() : Info
}