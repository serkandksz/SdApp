package com.serkan.sdapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.serkan.sdapp.fragments.EtTavukFragment
import com.serkan.sdapp.fragments.IcecekFragment
import com.serkan.sdapp.fragments.SebzeMeyveFragment
import com.serkan.sdapp.fragments.SutFragment


class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {return SebzeMeyveFragment() }
            1 -> {return IcecekFragment() }
            2 -> {return EtTavukFragment() }
            3 -> {return SutFragment() }
            else -> {return SebzeMeyveFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {return "Sebze-Meyve"}
            1 -> {return "İçecek"}
            2 -> {return "Et-Tavuk-Şarküter"}
            3 -> {return "Süt-Süt Ürunleri"}
            else ->{return "Sebze-Meyve"}
        }
    }



    override fun getCount(): Int {
        return 4
    }
}