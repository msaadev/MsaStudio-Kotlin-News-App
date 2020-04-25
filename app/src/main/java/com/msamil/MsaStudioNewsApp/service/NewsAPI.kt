package com.msamil.MsaStudioNewsApp.service

import com.msamil.MsaStudioNewsApp.model.news58
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsAPI {
    @GET
    fun getNews(@Url url:String):Single<news58>
}