package com.keyflow.utils

import android.content.ContentValues.TAG
import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

object GeneralUtility {

    fun parseTtime(time: String, currentFormat: String): String? {
        val inputPattern = currentFormat
        val outputPattern = "HH:mm"
        val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
        val outputFormat = SimpleDateFormat(outputPattern, Locale.ENGLISH)

        var nString: String? = null
        val inputTimeNewString = inputFormat.parse(time)
        nString = outputFormat.format(inputTimeNewString)

        return nString
    }

    fun parseTdate(date: String, currentFormat: String): String? {
        val inputPattern = currentFormat
        val outputPattern = "EEE,MMM,d"
        val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
        val outputFormat = SimpleDateFormat(outputPattern, Locale.ENGLISH)

        var nString: String? = null
        val inputDateNewString = inputFormat.parse(date)
        nString = outputFormat.format(inputDateNewString)

        return nString
    }

}