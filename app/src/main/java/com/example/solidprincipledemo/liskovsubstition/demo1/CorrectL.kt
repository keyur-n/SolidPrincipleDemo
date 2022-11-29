package com.example.solidprincipledemo.liskovsubstition.demo1

import android.view.MotionEvent
import android.view.View


// Fix of Interface Segregation principle
interface OnClickListener2 {
    fun onClick(v: View?)
}

interface OnLongClickListener {
    fun onLongClick(v: View?)
}

interface OnTouchListener {
    fun onTouch(v: View?, event: MotionEvent?)
}

class CorrectDemo:OnClickListener2{
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}

class CorrectDemo2:OnLongClickListener{
    override fun onLongClick(v: View?) {
        TODO("Not yet implemented")
    }
}

class CorrectDemo3:OnTouchListener{
    override fun onTouch(v: View?, event: MotionEvent?) {
        TODO("Not yet implemented")
    }
}