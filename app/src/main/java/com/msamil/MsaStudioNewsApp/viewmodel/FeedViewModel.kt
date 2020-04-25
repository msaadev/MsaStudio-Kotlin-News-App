package com.msamil.MsaStudioNewsApp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.msamil.MsaStudioNewsApp.model.news58
import com.msamil.MsaStudioNewsApp.service.NewsAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class FeedViewModel :ViewModel(){
    private val newsApiService = NewsAPIService()
    private val disposable = CompositeDisposable()

     val newsData = MutableLiveData<news58>()
    val newsError = MutableLiveData<Boolean>()
    val newsLoading = MutableLiveData<Boolean>()
fun refreshData(url:String){
getDataFromAPI(url)
}
    private fun getDataFromAPI(url:String){
        newsLoading.value = true

        disposable.add(
            newsApiService.getData(url)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<news58>(){
                    override fun onSuccess(t: news58) {
                        newsData.value =t
                        newsError.value = false
                        newsLoading.value = false

                    }

                    override fun onError(e: Throwable) {
                        newsLoading.value = false
                        newsError.value = true
                        e.printStackTrace()
                    }

                })
                )
    }
}