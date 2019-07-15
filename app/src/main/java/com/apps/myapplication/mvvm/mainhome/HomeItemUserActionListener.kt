package com.apps.myapplication.mvvm.mainhome

import com.apps.myapplication.data.source.remote.response.DataList

interface HomeItemUserActionListener {
    fun onNewsClicked(news: DataList)
}