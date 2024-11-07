package com.chan.hub.boj.info.adapter.`in`

import com.chan.hub.boj.config.logger
import com.chan.hub.boj.info.domain.Info
import com.chan.hub.boj.info.port.`in`.InfoUseCase
import com.chan.hub.boj.info.dto.response.ReadApplicationInfoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/info")
class InfoController(val infoUseCase : InfoUseCase) {

    val log = logger()

    @GetMapping
    fun readApplicationInfo() : ReadApplicationInfoResponse {
        val info : Info = infoUseCase.findApplicationInfo();
        return ReadApplicationInfoResponse.ofInfo(info)
    }
}