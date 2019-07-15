package com.apps.myapplication.mvvm.mainhome

import android.app.Activity
import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.content.Intent
import android.os.CountDownTimer
import android.support.annotation.StringRes
import android.util.Log
import android.widget.Toast
import com.apps.myapplication.data.source.remote.ApiClient
import com.apps.myapplication.data.source.remote.ApiInterfaces
import com.apps.myapplication.utils.ConstantUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.databinding.adapters.TextViewBindingAdapter.setText
import com.apps.myapplication.data.source.remote.response.BarangResponse
import com.apps.myapplication.data.source.remote.response.DataList
import com.apps.myapplication.mvvm.maindetail.DetailActivity


class HomeViewModel(context: Application, activity: Activity) : AndroidViewModel(context)  {

    var newList = MutableLiveData<List<DataList>>()
    var showProgress = MutableLiveData<Boolean>()
    var mcontext = context;
    var mactivity = activity;
    var count : Int = 1

    companion object {
        fun openDetailNews() : BarangResponse? = null
    }

    fun start(kategori : String) {
        getNews(kategori)
    }

    fun getNews(kategori : String) {
        showProgress.value = true
        var apiInterface: ApiInterfaces? = ApiClient.getClient().create(ApiInterfaces::class.java)
        var call = apiInterface?.doGetListJeans()
        if(kategori.equals("Jeans")){
            call = apiInterface?.doGetListJeans()
        }else if(kategori.equals("Hat")){
            call = apiInterface?.doGetListHat()
        }else if(kategori.equals("Shirt")){
            call = apiInterface?.doGetListShirt()
        }
        call?.enqueue(object : Callback<BarangResponse> {

            override fun onResponse(call: Call<BarangResponse>, response: Response<BarangResponse>) {
                if(response.body()?.list?.size.toString().equals("0")){
                    Toast.makeText(mcontext,"Data Kosong",Toast.LENGTH_LONG).show();
                }else{
                    newList.postValue(response.body()?.list);
                    showProgress.value = false
                }
            }

            override fun onFailure(call: Call<BarangResponse>, t: Throwable) {
                Toast.makeText(mcontext,t.message.toString(),Toast.LENGTH_LONG).show();
                call.cancel()
            }
        })
    }



}