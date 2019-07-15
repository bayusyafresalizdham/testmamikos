package com.apps.myapplication.mvvm.maindetail


import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.support.annotation.StringRes
import android.util.Log
import android.widget.Toast
import com.apps.myapplication.data.source.remote.ApiClient
import com.apps.myapplication.data.source.remote.ApiInterfaces
import com.apps.myapplication.utils.ConstantUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.support.design.widget.Snackbar
import android.support.v4.os.HandlerCompat.postDelayed
import android.R.attr.password
import android.app.Activity


class DetailViewModel(context: Application,activity: Activity) : AndroidViewModel(context)  {

    var price = MutableLiveData<String>()
    var description = MutableLiveData<String>()
    var brand= MutableLiveData<String>()
    var source= MutableLiveData<String>()
    var name= MutableLiveData<String>()
    var urlToImage= MutableLiveData<String>()
    var mcontext = context;
    var mactivity = activity;


    fun start() {
        getDetail()
    }

    fun getDetail() {
        urlToImage.postValue(ConstantUtils.barang_image_url)
        name.postValue(ConstantUtils.barang_name)
        brand.postValue(ConstantUtils.barang_brand)
        price.postValue(ConstantUtils.barang_price)
        description.postValue(ConstantUtils.barang_description)
    }

    fun onClickFinish() {
        mactivity.finish()
    }

}