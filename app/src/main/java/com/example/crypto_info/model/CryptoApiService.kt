package com.example.crypto_info.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CryptoApiService {

    private val BASE_URL = "https://api.nomics.com"

    private val apiService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(CryptoApi::class.java)

    fun getCryptos(): Single<List<CryptoCurrencies>>{
        return apiService.getCryptos()
    }
}