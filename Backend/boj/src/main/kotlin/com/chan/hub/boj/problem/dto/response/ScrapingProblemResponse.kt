package com.chan.hub.boj.problem.dto.response

import com.chan.hub.boj.problem.domain.Problem
import org.jsoup.nodes.Document

data class ScrapingProblemResponse(
    val title: String,
    val blogUrl : String,
    val tags : String,
    val javaCode : String
){

    companion object{
        fun ofDocument(doc: Document): ScrapingProblemResponse
                = ScrapingProblemResponse(
            title = doc.select("problem-name").first()!!.ownText(),
            blogUrl = doc.select("blog").first()!!.ownText(),
            tags = doc.select("tag").first()!!.ownText(),
            javaCode = doc.select("java-code").first()!!.ownText()
        )
    }

    fun toProblem() : Problem
     = Problem(
        title = title,
        blogUrl = blogUrl,
        tags = tags,
        javaCode = javaCode
     )
}