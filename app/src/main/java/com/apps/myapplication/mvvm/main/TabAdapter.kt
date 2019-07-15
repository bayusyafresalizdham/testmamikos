package com.apps.myapplication.mvvm.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.apps.myapplication.mvvm.mainhome.HomeFragment

class TabAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment.newInstance("Jeans")
            }
            1 -> {
                HomeFragment.newInstance("Hat")
            }
            else -> {
                HomeFragment.newInstance("Shirt")
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Jeans"
            1 -> "Hat"
            else -> {
                return "Shirt"
            }
        }
    }
}