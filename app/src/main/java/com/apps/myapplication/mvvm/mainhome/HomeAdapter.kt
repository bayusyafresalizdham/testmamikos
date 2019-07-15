package com.apps.myapplication.mvvm.mainhome

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.apps.myapplication.R
import com.apps.myapplication.data.source.remote.response.DataList
import com.apps.myapplication.databinding.HomeItemBinding
import com.apps.myapplication.mvvm.maindetail.DetailActivity
import com.apps.myapplication.utils.ConstantUtils

class HomeAdapter(private var news: List<DataList>, private var context: Activity, private var mainViewModel: HomeViewModel) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val item = news[p1]

        val userActionListener = object : HomeItemUserActionListener {
            override fun onNewsClicked(news: DataList) {

                ConstantUtils.barang_brand= news.brand
                ConstantUtils.barang_description= news.description
                ConstantUtils.barang_id= ""+news.id
                ConstantUtils.barang_image_url= news.image_url
                ConstantUtils.barang_name= news.name
                ConstantUtils.barang_price= news.price

                val i = Intent(context,DetailActivity::class.java)
                context.startActivity(i)

            }
        }

        (p0 as MainItemHolder).bindItem(item, userActionListener)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val mainItemBinding: HomeItemBinding = DataBindingUtil.inflate(LayoutInflater.from(p0!!.context),
            R.layout.home_item, p0, false)

        return MainItemHolder(mainItemBinding)
    }

    override fun getItemCount(): Int = news.size

    fun replaceData(news: List<DataList>) {
        setList(news)
    }

    fun setList(news: List<DataList>) {
        this.news = news

        notifyDataSetChanged()
    }

    class MainItemHolder(itemView: HomeItemBinding) : RecyclerView.ViewHolder(itemView.root) {
        private val mainItemBinding = itemView

        fun bindItem(news: DataList, userActionListener: HomeItemUserActionListener) {
            mainItemBinding.item = news
            mainItemBinding.userActionListener = userActionListener
            mainItemBinding.executePendingBindings()
        }
    }
}
