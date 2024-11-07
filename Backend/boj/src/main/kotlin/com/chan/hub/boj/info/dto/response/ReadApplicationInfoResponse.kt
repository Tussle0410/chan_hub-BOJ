package com.chan.hub.boj.info.dto.response

import com.chan.hub.boj.info.domain.Info

data class ReadApplicationInfoResponse(
    val solvedProblemCount: Int
) {
    companion object {
        fun ofInfo(info: Info): ReadApplicationInfoResponse = ReadApplicationInfoResponse(
            solvedProblemCount = info.solvedProblemCount
        )
    }
}

