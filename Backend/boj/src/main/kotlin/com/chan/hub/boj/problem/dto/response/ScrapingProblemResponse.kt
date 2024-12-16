package com.chan.hub.boj.problem.dto.response

import com.chan.hub.boj.problem.domain.Problem
import org.jsoup.nodes.Document

data class ScrapingProblemResponse(
    val problemId : String,
    val title: String,
    val blogUrl : String,
    val tags : String,
    val javaCode : String
){

    companion object{
        fun ofDocument(doc: Document, problemNo: String): ScrapingProblemResponse
                = ScrapingProblemResponse(
            problemId = problemNo,
            title = doc.select("problem-name").first()!!.ownText(),
            blogUrl = doc.select("blog").first()!!.ownText(),
            tags = doc.select("tag").first()!!.ownText(),
            javaCode = doc.select("java-code").first()!!.ownText()
        )
    }

    fun toProblem() : Problem
     = Problem(
        problemId = problemId,
        title = title,
        blogUrl = blogUrl,
        tags = tags,
        javaCode = javaCode
     )
}