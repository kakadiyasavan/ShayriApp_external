package com.example.shayriappexternaldatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayriappexternaldatabase.Adapter.ShayriAdapter
import com.example.shayriappexternaldatabase.Database.DataBase
import com.example.shayriappexternaldatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    private  val TAG = "MainActivity"
    var adapter = ShayriAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var db = DataBase(this)
        var list = db.shayri

        adapter.addShayri(list)

        binding.shayriList.layoutManager = LinearLayoutManager(this)
        binding.shayriList.adapter = adapter

        for (l in list){
            Log.e(TAG,"onCreate: ========== "+l.text)
            Log.e(TAG, "onCreate: -=-=-=-=-=-=-=-=-=-=-=-")
        }
    }
}