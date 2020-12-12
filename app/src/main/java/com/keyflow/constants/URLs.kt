package com.keyflow.constants

import android.content.Context
import com.keyflow.utils.SingletonHolder

class URLs private constructor(private val context: Context){
    val BASE_URL = "https://stage-api.keyflow.com/"
    val IMAGE_BASE_URL = "https://res.cloudinary.com/keyflow/image/upload/"
    val API_URL = BASE_URL + "capi/v4/"
    val EVENT = API_URL + "events/"



    companion object : SingletonHolder<URLs, Context>(::URLs)
}