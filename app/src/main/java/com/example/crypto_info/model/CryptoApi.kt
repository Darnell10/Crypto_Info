package com.example.crypto_info.model

import io.reactivex.Single
import retrofit2.http.GET

interface CryptoApi {

    @GET("")
    fun getCryptos(): Single<List<CryptoCurrencies>>
}

//checking to see if this works