package com.rivandwiarhiansyah.wetravel3.Activity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.rivandwiarhiansyah.wetravel3.Model.Food
import com.rivandwiarhiansyah.wetravel3.R
import java.lang.String

class DetailFavoriteActivity : AppCompatActivity(), OnMapReadyCallback {
    private var food: Food? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_favorite)
        val tvName = findViewById<TextView>(R.id.tv_item_name_detail)
        val tvAddress = findViewById<TextView>(R.id.tv_item_address)
        val mapFragment =
            supportFragmentManager.findFragmentById(R.id.map_detail) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
        food = intent.getParcelableExtra(ITEM_EXTRA)
        if (food != null) {
            Glide.with(this)
            tvName.setText(food!!.name)
            Log.e("LAT", String.valueOf(food!!.latitude))
            Log.e("LNG", String.valueOf(food!!.longitude))
            tvAddress.setText(food!!.address)
        }
        if (supportActionBar != null) {
            supportActionBar!!.setTitle("Detail Favorit Item")
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val latLng: LatLng
        latLng = if (food != null) {
            LatLng(food!!.latitude, food!!.longitude)
        } else {
            LatLng(-7.455929882681647, 109.2883416677493)
        }
        val options = MarkerOptions()
        options.position(latLng).title(food?.address)
        googleMap.addMarker(options)
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng))
    }

    companion object {
        const val ITEM_EXTRA = "item_extra"
    }
}