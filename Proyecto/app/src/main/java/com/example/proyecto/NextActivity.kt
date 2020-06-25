package com.example.proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tesisapp.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        set_button.setOnClickListener {
            saveData()
        }
        update_button.setOnClickListener {
            updateData()
        }
        delete_button.setOnClickListener {
            deleteData()
        }
        read_single_button.setOnClickListener {
            readSingleData()
        }
        read_observe_button.setOnClickListener {
            readObserveData()
        }
        query_single_button.setOnClickListener {
            querySingleData()
        }
        query_observe_button.setOnClickListener {
            queryObserveData()
        }
    }
    fun saveData(){
        var setEditTextString = set_edittext.text.toString()

        var map = mutableMapOf<String,Any>()
        map["name"] = "howl"
        map["age"] = setEditTextString

        FirebaseDatabase.getInstance().reference
            .child("users")
            .child("1")
            .setValue(map)
    }
    fun updateData(){
        var updateEditTextString = update_edittext.text.toString()

        var map = mutableMapOf<String,Any>()
        map["gender"] = updateEditTextString

        FirebaseDatabase.getInstance().reference
            .child("users")
            .child("1")
            .updateChildren(map)

    }

    fun deleteData(){
        FirebaseDatabase.getInstance().reference
            .child("users")
            .child("1")
            .removeValue()
    }
    fun readSingleData(){
        FirebaseDatabase.getInstance().reference
            .child("users")
            .child("1")
            .addListenerForSingleValueEvent(object : ValueEventListener{
                override fun onCancelled(p0: DatabaseError) {

                }

                override fun onDataChange(p0: DataSnapshot) {
                    var map = p0.value as Map<String,Any>
                    read_single_textview.text = map["age"].toString()
                }

            })
    }
    fun readObserveData(){
        FirebaseDatabase.getInstance().reference
            .child("users")
            .child("1")
            .addValueEventListener(object : ValueEventListener{
                override fun onCancelled(p0: DatabaseError) {

                }

                override fun onDataChange(p0: DataSnapshot) {
                    var map = p0.value as Map<String,Any>
                    read_observe_textview.text = map["age"].toString()
                }

            })
    }
    fun querySingleData(){
        FirebaseDatabase.getInstance().reference
            .child("users")
            .orderByChild("age").equalTo(query_single_edittext.text.toString())
            .addListenerForSingleValueEvent(object : ValueEventListener{
                override fun onCancelled(p0: DatabaseError) {

                }

                override fun onDataChange(p0: DataSnapshot) {
                    var map = p0.children.first().value as Map<String,Any>
                    query_single_textview.text = map["name"].toString()
                }

            })
    }
    fun queryObserveData(){
        FirebaseDatabase.getInstance().reference
            .child("users")
            .orderByChild("age").equalTo(query_observe_edittext.text.toString())
            .addValueEventListener(object : ValueEventListener{
                override fun onCancelled(p0: DatabaseError) {

                }

                override fun onDataChange(p0: DataSnapshot) {
                    var map = p0.children.first().value as Map<String,Any>
                    query_observe_textview.text = map["name"].toString()
                }

            })
    }
}