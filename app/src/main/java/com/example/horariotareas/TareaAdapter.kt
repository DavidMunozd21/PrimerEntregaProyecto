package com.example.horariotareas

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class TareaAdapter(val ctx: MainActivity, val layout: Int, val data: ArrayList<String>)
    : ArrayAdapter<String>(ctx, layout, data){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View{
        val view = ctx.layoutInflater.inflate(layout, null)
            return view
    }
}