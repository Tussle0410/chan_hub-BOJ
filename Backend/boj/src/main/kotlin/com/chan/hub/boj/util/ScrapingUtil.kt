package com.chan.hub.boj.util

import com.chan.hub.boj.config.exception.BaseException
import com.chan.hub.boj.config.logger
import com.chan.hub.boj.enums.ExceptionCode
import org.jsoup.HttpStatusException
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.rmi.ServerException

@Component
class ScrapingUtil {

    @Value("\${scraping.prefix-url}")
    private lateinit var PREFIX_URL : String
    val log = logger()

    fun scrapProblem(problemNo: String): Document {
        val url = "$PREFIX_URL/Problem/$problemNo.txt"
        return try{
            Jsoup.connect(url).get()
        }catch(exception : HttpStatusException){
            if(exception.statusCode == 404){
                log.warn("Problem Not Found - problemNo : $problemNo")
                throw BaseException(ExceptionCode.PROBLEM_NOT_FOUND);
            }
            throw BaseException(ExceptionCode.SCRAPING_ERROR)
        }catch (exception : Exception){
            throw BaseException(ExceptionCode.SCRAPING_ERROR)
        }
    }

    fun scrapApplicationInfo(): Document {
        try{
            val url = "$PREFIX_URL/ApplicationInfo.txt"
            return Jsoup.connect(url).get()
        }catch(exception : HttpStatusException){
            if(exception.statusCode == 404){
                log.warn("o")
                throw BaseException(ExceptionCode.PROBLEM_NOT_FOUND);
            }
            throw BaseException(ExceptionCode.SCRAPING_ERROR)
        }catch (exception : Exception){
            throw BaseException(ExceptionCode.SCRAPING_ERROR)
        }

    }
}