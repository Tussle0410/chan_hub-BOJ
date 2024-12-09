package com.chan.hub.boj.util

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class ScrapingUtil {

    @Value("\${scraping.prefix-url}")
    private lateinit var PREFIX_URL : String

    fun scrapProblem(problemNo: String): Document {
        val url = "$PREFIX_URL/Problem/$problemNo/Main.txt"
        return Jsoup.connect(url).get()
    }

    fun scrapApplicationInfo(): Document {
        val url = "$PREFIX_URL/ApplicationInfo.txt"
        return Jsoup.connect(url).get()
    }
}