package com.example.crypto_info.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class CryptoCurrencies(

    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: String?,

    @ColumnInfo(name = "symbol")
    @SerializedName("original_symbol")
    val original_symbol: String?,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: String?,

    @ColumnInfo(name = "description")
    @SerializedName("description")
    val description: String?,

    @ColumnInfo(name = "website")
    @SerializedName("website_url")
    val website_url: String?,

    @ColumnInfo(name = "logo")
    @SerializedName("logo_url")
    val logo_url: String?


) {
    @PrimaryKey(autoGenerate = true)
    var uuid: Int = 0
}