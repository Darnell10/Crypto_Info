package com.example.crypto_info.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CryptoDao {

    @Insert
    suspend fun insertAll(vararg cryptos: CryptoCurrencies): List<Long>

    @Query("SELECT * FROM cryptocurrencies")
    suspend fun getAllcryptos(): List<CryptoCurrencies>

    @Query("SELECT * FROM cryptocurrencies WHERE uuid = :cryptoId")
    suspend fun getCrypto(cryptoId: Int): CryptoCurrencies

    @Query("DELETE FROM cryptoCurrencies")
    suspend fun deleteAllCryptos()

}