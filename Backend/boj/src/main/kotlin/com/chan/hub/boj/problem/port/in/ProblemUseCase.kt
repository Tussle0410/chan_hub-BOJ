package com.chan.hub.boj.problem.port.`in`

import com.chan.hub.boj.problem.domain.Problem

interface ProblemUseCase {
    fun readProblemCode(problemNo: String) : Problem
}