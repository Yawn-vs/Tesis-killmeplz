package com.example.tesisapp

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
//import com.example.tesisapp.NextActivity
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*


class tab1 : AppCompatActivity() {

    /*private TabLayout tabLayout
    private ViewPager viewPager
    private TabItem tab1, tab2, tab3
    public PageAdapter pageradapter*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tab1)

       // tablayout.setOnTabSelectedListener(new tablayout.on)
    }

//    fun moveNextPage(){
//        var currentUser = FirebaseAuth.getInstance().currentUser
//        if(currentUser != null){
//            startActivity(Intent(this, NextActivity::class.java))
//        }
//    }

}