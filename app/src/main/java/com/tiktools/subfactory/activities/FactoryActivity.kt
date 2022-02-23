package com.tiktools.subfactory.activities

import android.animation.AnimatorInflater
import android.annotation.SuppressLint
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tiktools.subfactory.R
import com.tiktools.subfactory.adapters.MinerAdapter
import com.tiktools.subfactory.databinding.ActivityFactoryBinding
import com.tiktools.subfactory.viewmodels.FactoryViewModel

class FactoryActivity : AppCompatActivity() {
    private val viewModel : FactoryViewModel by viewModels()
    lateinit var viewBinding : ActivityFactoryBinding

    //Observers
    private lateinit var cardSearchObserver : Observer<Boolean>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityFactoryBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.recyclerMines.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        viewBinding.recyclerMines.adapter = MinerAdapter(viewModel)

        cardSearchObserver = Observer {
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun onClickButtonsFactory(view : View){
        when(view.tag as String){
            "cancel" ->{
                buttonAnimate(R.drawable.cancel_butt, view)
                view.tag = "searchIn"
            }
            "searchIn" ->{
                buttonAnimate(R.drawable.search_butt, view)
                view.tag = "cancel"
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
    }

    override fun onStop() {
        super.onStop()
    }
}