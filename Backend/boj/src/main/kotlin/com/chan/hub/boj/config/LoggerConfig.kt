package com.chan.hub.boj.config

import org.slf4j.LoggerFactory

/**
 * LoggerConfig
 */
inline fun <reified T> T.logger() = LoggerFactory.getLogger(T::class.java)!!
