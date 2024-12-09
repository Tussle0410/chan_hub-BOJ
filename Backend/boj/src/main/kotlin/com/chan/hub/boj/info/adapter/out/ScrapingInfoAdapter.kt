package com.chan.hub.boj.info.adapter.out

import com.chan.hub.boj.info.domain.Info
import com.chan.hub.boj.info.dto.response.ScrapingApplicationInfoResponse
import com.chan.hub.boj.info.port.out.ScrapingInfoPort
import com.chan.hub.boj.util.ScrapingUtil
import org.springframework.stereotype.Component

@Component
class ScrapingInfoAdapter(val scrapingUtil: ScrapingUtil) : ScrapingInfoPort {

    override fun findApplicationInfo(): Info {
        val scrapInfo = ScrapingApplicationInfoResponse.ofDocument(scrapingUtil.scrapApplicationInfo())

        return scrapInfo.toInfo()
    }
}