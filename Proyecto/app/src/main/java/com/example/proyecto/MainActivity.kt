package com.example.tesisapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
/*import android.support.design.widget.TabLayout;*/


class MainActivity : AppCompatActivity() {

/*    private lateinit var TabLayout: tabLayout
    private lateinit var ViewPager: viewPager
    private lateinit var TabItem: tab1
    private lateinit var TabItem2: tab2
    private lateinit var TabItem3: tab3
    public lateinit var PageAdapter: pageradapter*/


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val btnShow = findViewById<Button>(R.id.btnShow)
        //btnShow?.setOnClickListener { Toast.makeText(this@MainActivity, R.string.welcome_message, Toast.LENGTH_LONG).show() }
        botonRegistro.setOnClickListener(){
            startActivity(Intent(this, tab1::class.java))
        }
    }

}