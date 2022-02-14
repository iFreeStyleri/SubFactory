package com.tiktools.subfactory.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tiktools.subfactory.R
import com.tiktools.subfactory.databinding.ActivityMarketBinding

class MarketActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMarketBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMarketBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}