package com.chan.hub.boj.problem.application

import com.chan.hub.boj.problem.domain.Problem
import com.chan.hub.boj.problem.port.`in`.ProblemUseCase
import com.chan.hub.boj.problem.port.out.ScrapingProblemPort
import org.springframework.stereotype.Component

@Component
class ProblemApplication(val scrapingProblemPort: ScrapingProblemPort) : ProblemUseCase{

    override fun readProblemCode(problemNo: String): Problem {

        return scrapingProblemPort.scrapProblem(problemNo)

    }

}