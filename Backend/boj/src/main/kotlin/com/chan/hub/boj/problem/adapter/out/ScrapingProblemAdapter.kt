package com.chan.hub.boj.problem.adapter.out

import com.chan.hub.boj.problem.domain.Problem
import com.chan.hub.boj.problem.dto.response.ScrapingProblemResponse
import com.chan.hub.boj.problem.port.out.ScrapingProblemPort
import com.chan.hub.boj.util.ScrapingUtil
import org.springframework.stereotype.Component

@Component
class ScrapingProblemAdapter : ScrapingProblemPort {


    override fun scrapProblem(problemNo: String): Problem {

        val scrapProblem = ScrapingProblemResponse.ofDocument(ScrapingUtil.scrapProblem(problemNo))

        return scrapProblem.toProblem()

    }

}