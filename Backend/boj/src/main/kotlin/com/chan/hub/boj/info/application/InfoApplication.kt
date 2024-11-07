package com.chan.hub.boj.info.application

import com.chan.hub.boj.info.domain.Info
import com.chan.hub.boj.info.port.`in`.InfoUseCase
import com.chan.hub.boj.info.port.out.ScrapingInfoPort
import org.springframework.stereotype.Component

@Component
class InfoApplication(val infoPort : ScrapingInfoPort) : InfoUseCase {

    override fun findApplicationInfo(): Info {
        return infoPort.findApplicationInfo();
    }
}