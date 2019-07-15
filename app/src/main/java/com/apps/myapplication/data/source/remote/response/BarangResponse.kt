package com.apps.myapplication.data.source.remote.response

data class BarangResponse(
    val list: List<DataList>,
    val status: Boolean
)

data class DataList(
    val brand: String,
    val description: String,
    val id: Int,
    val image_url: String,
    val name: String,
    val price: String
)