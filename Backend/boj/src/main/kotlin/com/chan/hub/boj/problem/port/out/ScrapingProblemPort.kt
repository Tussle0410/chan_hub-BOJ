package com.chan.hub.boj.problem.port.out

import com.chan.hub.boj.problem.domain.Problem

interface ScrapingProblemPort {

    fun scrapProblem(problemNo: String): Problem
}