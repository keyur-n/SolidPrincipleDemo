package com.example.solidprincipledemo.liskovsubstition.demo1

import android.view.MotionEvent
import android.view.View
import android.widget.Button
import com.example.solidprincipledemo.R


interface OnClickListener {
    fun onClick(v: View?)
    fun onLongClick(v: View?)
    fun onTouch(v: View?, event: MotionEvent?)
}

class WrongDemo:OnClickListener{
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    override fun onLongClick(v: View?) {
        TODO("Not yet implemented")
    }

    override fun onTouch(v: View?, event: MotionEvent?) {
        TODO("Not yet implemented")
    }

}
