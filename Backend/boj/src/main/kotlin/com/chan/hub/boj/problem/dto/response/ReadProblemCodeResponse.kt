package com.chan.hub.boj.problem.dto.response

import com.chan.hub.boj.problem.domain.Problem
import com.google.googlejavaformat.java.Formatter

data class ReadProblemCodeResponse(
    val title: String,
    val blogUrl : String,
    val tags : String,
    val javaCode : String
)
{
    companion object {
        fun ofProblem(problem : Problem) : ReadProblemCodeResponse{

            return ReadProblemCodeResponse(
                title = problem.title,
                blogUrl = problem.blogUrl,
                tags = problem.tags,
                javaCode = Formatter().formatSource(problem.javaCode)
            )
        }
    }
}