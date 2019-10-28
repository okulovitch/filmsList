package com.example.data.remote.helpers

import com.example.data.remote.service.FilmsService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    companion object{
        val BASE_URL = "http://www.mocky.io/v2/57cffac8260000181e650041"
    }

//    private fun getOkHttpInstance(): OkHttpClient {
//
//    }
//    private fun getRetrofitClient():Retrofit{
//    return Retrofit.Builder()
//        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//        .addConverterFactory(GsonConverterFactory.create())
//        .baseUrl(BASE_URL).build(
//     }
    fun loadData(){
    var reqestInterface = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build().create(FilmsService::class.java)

}
    fun getFilmsService() = RetrofitFactory
}