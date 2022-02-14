package com.tiktools.subfactory.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tiktools.subfactory.databinding.ActivityCardsBinding

class CardsActivity : AppCompatActivity() {
    lateinit var viewBinding : ActivityCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityCardsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}