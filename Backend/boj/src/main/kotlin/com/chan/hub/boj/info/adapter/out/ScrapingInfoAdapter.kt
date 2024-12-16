package com.chan.hub.boj.info.adapter.out

import com.chan.hub.boj.config.logger
import com.chan.hub.boj.info.domain.Info
import com.chan.hub.boj.info.dto.response.ScrapingApplicationInfoResponse
import com.chan.hub.boj.info.port.out.ScrapingInfoPort
import com.chan.hub.boj.util.ScrapingUtil
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ScrapingInfoAdapter(val scrapingUtil: ScrapingUtil) : ScrapingInfoPort {
    private val log = logger()
    private var problemCount : Int = 0

    override fun findApplicationInfo(): Info {
        return Info(problemCount)
    }

    @Scheduled(fixedDelay = 1000 * 60 * 60 * 24)
    fun scrapApplicationInfo() {
        val scrapInfo : ScrapingApplicationInfoResponse = ScrapingApplicationInfoResponse.ofDocument(scrapingUtil.scrapApplicationInfo())
        problemCount = scrapInfo.solvedProblemCount
        log.info("ScrapingInfoAdapter Update Patch - problemCount: $problemCount")
    }
}