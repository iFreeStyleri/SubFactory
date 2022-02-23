package com.tiktools.subfactory.activities

import android.animation.AnimatorInflater
import android.content.Intent
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import com.tiktools.subfactory.R
import com.tiktools.subfactory.databinding.ActivityMainBinding
import com.tiktools.subfactory.viewmodels.MainViewModel
import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private val viewModel : MainViewModel by viewModels()
    private lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(viewBinding.root)
        viewModel.init(this)
    }

    fun onClickButton(view : View){
        when(view.tag as String) {
            "factory" ->{
                buttonAnimate(R.drawable.factory, view)
                val intent = Intent(this@MainActivity, FactoryActivity::class.java)
                startActivity(intent)
            }
            "cards" ->{
                buttonAnimate(R.drawable.cards, view)
                val intent = Intent(this@MainActivity, CardsActivity::class.java)
                startActivity(intent)
            }
            "market" ->{
                buttonAnimate(R.drawable.market, view)
                val intent = Intent(this@MainActivity, MarketActivity::class.java)
                startActivity(intent)
            }
        }
    }


    private fun buttonAnimate(idResource : Int, view: View){
        view.foreground = resources.getDrawable(idResource, resources.newTheme())
        val anim = view.foreground as Animatable
        anim.start()
    }


    override fun onStart() {
        super.onStart()
        val anim = AnimatorInflater.loadAnimator(this, R.animator.status_bar)
        anim.setTarget(viewBinding.statusBar)
        anim.start()
    }
}