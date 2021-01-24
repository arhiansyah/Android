package com.rivandwiarhiansyah.wetravel3.Activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rivandwiarhiansyah.wetravel3.Fragment.*
import com.rivandwiarhiansyah.wetravel3.R

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.itemIconTintList = null
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_layout, fragment)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (item.itemId) {
            R.id.menu_home -> fragment = HomeFragment()
            R.id.menu_booking -> fragment = BookingFragment()
            R.id.menu_favorite -> fragment = FavoriteFragment()
            R.id.menu_notification -> fragment = NotificationFragment()
            R.id.menu_chat -> fragment = ChatFragment()
        }
        return loadFragment(fragment)
    }
}