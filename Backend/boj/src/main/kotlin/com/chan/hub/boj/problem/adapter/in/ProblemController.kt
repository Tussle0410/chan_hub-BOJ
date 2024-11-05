package com.chan.hub.boj.problem.adapter.`in`

import com.chan.hub.boj.config.logger
import com.chan.hub.boj.problem.dto.response.ReadProblemCodeResponse
import com.chan.hub.boj.problem.port.`in`.ProblemUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/problem")
class ProblemController(val problemUseCase : ProblemUseCase) {

    val log = logger()

    @GetMapping("{problemNo}")
    fun readProblemCode(
        @PathVariable problemNo: String): ReadProblemCodeResponse{

        log.info("ReadProblemCode - PathVariable - problemNo : $problemNo")
        return ReadProblemCodeResponse.ofProblem(problemUseCase.readProblemCode(problemNo))

    }
}