package com.msamil.MsaStudioNewsApp.service

import com.msamil.MsaStudioNewsApp.model.news58
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NewsAPIService {
    private val BASE_URL = "http://newsapi.org/v2/"
    private val api = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(NewsAPI::class.java)



    fun getData(url:String):Single<news58>{
        return api.getNews(url)
    }
}