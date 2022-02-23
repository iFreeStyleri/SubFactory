package com.tiktools.subfactory.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Animatable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.tiktools.subfactory.R
import com.tiktools.subfactory.viewmodels.FactoryViewModel

class MinerAdapter(viewModel : FactoryViewModel) : RecyclerView.Adapter<MinerAdapter.MinerViewHolder>() {
    private val FOOTER : Int = 1


    private var data : MutableLiveData<MutableList<Any>> = MutableLiveData()
    init{
        data.value = ArrayList()
    }
    fun setData( objects : MutableLiveData<MutableList<Any>>){
        data = objects
    }

    fun addItem( item : Any) {
        val list = data.value!!
        list.add(item)
        notifyItemInserted(list.size)
    }

    fun updItem(item : Any, position: Int){
        val list = data.value!!
        list.removeAt(position)
        list.add(position, item)
        notifyItemChanged(position)
    }

    fun getItems() : MutableLiveData<MutableList<Any>> = data

    class MinerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(){
            val minerImage = view.findViewById<ImageView>(R.id.minerView)
            minerImage.setBackgroundResource(R.drawable.solo_cave)
        }

        @SuppressLint("UseCompatLoadingForDrawables")
        fun bindFOOTER() {
            val caveImage = view.findViewById<ImageView>(R.id.searchView)
            caveImage.setOnClickListener{
                it.foreground = view.resources.getDrawable(R.drawable.search_cave, view.context.theme)
                val anim = it.foreground as Animatable
                anim.start()
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        val list = data.value!!
        if(list.size+1 == position || list.size == 0){
            return FOOTER
        }
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MinerViewHolder {
        return if(viewType == FOOTER){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.search_item, parent, false)
            MinerViewHolder(view)
        }
        else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.mine_item, parent, false)
            MinerViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: MinerViewHolder, position: Int) {
        val list = data.value!!
        if(itemCount == position || itemCount-1 == 0){
            holder.bindFOOTER()
        }
        else if(list.size != 0){
            holder.bind()
        }
    }

    override fun getItemCount():Int = data.value!!.size+1

}