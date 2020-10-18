package com.serkan.sdapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.serkan.sdapp.fragments.SiparisFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val siparisFragment= SiparisFragment()
        setCurrentFragment(siparisFragment)

        bottom_nav.setupWithNavController(Navigation.findNavController(this,R.id.fragment))

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.siparis -> setCurrentFragment(siparisFragment)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragment, fragment)
        commit()
    }
}