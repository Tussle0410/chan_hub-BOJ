package com.chan.hub.boj.info.dto.response

import com.chan.hub.boj.info.domain.Info
import org.jsoup.nodes.Document

data class ScrapingApplicationInfoResponse(
    val solvedProblemCount: Int
) {
    companion object {
        fun ofDocument(scrapingApplicationInfo: Document): ScrapingApplicationInfoResponse =
            ScrapingApplicationInfoResponse(
                solvedProblemCount = scrapingApplicationInfo.select("solved-problem-count").first()!!.ownText().toInt()
            )
    }

    fun toInfo() : Info
     = Info(
        solvedProblemCount = solvedProblemCount
     )
}