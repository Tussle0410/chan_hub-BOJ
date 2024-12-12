package com.chan.hub.boj.problem.adapter.out

import com.chan.hub.boj.problem.domain.Problem
import com.chan.hub.boj.problem.dto.response.ScrapingProblemResponse
import com.chan.hub.boj.problem.port.out.ScrapingProblemPort
import com.chan.hub.boj.util.ScrapingUtil
import org.springframework.stereotype.Component

@Component
class ScrapingProblemAdapter(val scrapingUtil: ScrapingUtil) : ScrapingProblemPort {

    override fun scrapProblem(problemNo: String): Problem {
        val scrapProblem : ScrapingProblemResponse = ScrapingProblemResponse.ofDocument(scrapingUtil.scrapProblem(problemNo))
        return scrapProblem.toProblem()
    }

}