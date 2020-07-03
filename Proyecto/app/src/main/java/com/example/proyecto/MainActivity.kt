package com.example.tesisapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    /*private TabLayout tabLayout
    private ViewPager viewPager
    private TabItem tab1, tab2, tab3
    public PageAdapter pageradapter*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val btnShow = findViewById<Button>(R.id.btnShow)
        //btnShow?.setOnClickListener { Toast.makeText(this@MainActivity, R.string.welcome_message, Toast.LENGTH_LONG).show() }
        botonRegistro.setOnClickListener(){
            val intentGoTotabtab1= Intent (this, tab1::class.java)
            startActivity(intentGoTotabtab1)
        }
    }

    fun moveNextPage(){
        var currentUser = FirebaseAuth.getInstance().currentUser
        if(currentUser != null){
            startActivity(Intent(this, NextActivity::class.java))
        }
    }

}