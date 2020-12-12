package com.keyflow.interfaces

import DataEvents
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {

    @GET
    fun getEvents(@Url api: String): Observable<DataEvents>
}