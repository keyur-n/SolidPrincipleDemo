package com.example.solidprincipledemo.liskovsubstition.demo2

interface VehicleCorrect{
    fun moveForward()
    fun moveBack()
}

abstract class VehicleWithEngineCorrect: VehicleCorrect{
    private var isEngineWorking = false
    open fun startEngine(){ isEngineWorking = true }
    open fun stopEngine(){ isEngineWorking = false }
}

class CarCorrect: VehicleWithEngineCorrect(){
    override fun startEngine() {
        super.startEngine()
        println("Engine started")
    }

    override fun stopEngine() {
        super.stopEngine()
        println("Engine stopped")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}


class BicycleCorrect: VehicleCorrect{
    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}