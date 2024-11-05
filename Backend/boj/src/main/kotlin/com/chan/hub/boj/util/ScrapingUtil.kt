package com.chan.hub.boj.util

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class ScrapingUtil {

    companion object {
        fun scrapProblem(problemNo: String): Document {

            val url = "https://raw.githubusercontent.com/Tussle0410/chan_hub-BOJ/main/Problem/$problemNo/Main.txt"
            return Jsoup.connect(url).get()

        }
    }
}