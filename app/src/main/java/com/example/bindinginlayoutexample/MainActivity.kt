package com.example.bindinginlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindinginlayoutexample.databinding.ActivityMainBinding
import com.example.bindinginlayoutexample.model.NumberModel

class MainActivity : AppCompatActivity() {
    private lateinit var databinding: ActivityMainBinding
    private lateinit var number: NumberModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        number = NumberModel()
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        databinding.number = number

    }
}