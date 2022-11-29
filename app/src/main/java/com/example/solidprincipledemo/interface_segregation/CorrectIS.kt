package com.example.solidprincipledemo.interface_segregation

interface AnimalCorrect {
    fun eat()
    fun sleep()
}

interface FlyingAnimalCorrect {
    fun fly()
}

class CatCorrect : AnimalCorrect {
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }
}

class BirdCorrect : AnimalCorrect, FlyingAnimalCorrect {
    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }
}