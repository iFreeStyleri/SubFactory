package com.tiktools.subfactory.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tiktools.subfactory.databinding.ActivityFactoryBinding

class FactoryActivity : AppCompatActivity() {
    lateinit var viewBinding : ActivityFactoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityFactoryBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}