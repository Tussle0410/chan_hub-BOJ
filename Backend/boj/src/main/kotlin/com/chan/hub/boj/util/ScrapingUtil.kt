package com.chan.hub.boj.util

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class ScrapingUtil {

    companion object {
        private const val PREFIX_URL = "https://raw.githubusercontent.com/Tussle0410/chan_hub-BOJ/main/"
        fun scrapProblem(problemNo: String): Document {
            val url = "$PREFIX_URL/Problem/$problemNo/Main.txt"
            return Jsoup.connect(url).get()
        }

        fun scrapApplicationInfo(): Document {
            val url = "$PREFIX_URL/ApplicationInfo.txt"
            return Jsoup.connect(url).get()
        }
    }
}