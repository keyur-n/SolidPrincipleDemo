package com.example.solidprincipledemo.dipendency_inversion

interface IProgram {
    fun work()
}

class ProgramCorrect:IProgram {
    override fun work() {
        TODO("Not yet implemented")
    }
}

class SuperProgramCorrect : IProgram {
    override fun work() {
        //....code
    }
}

class EngineerCorrect {
    var program: IProgram? = null
    fun setPrograms(p: IProgram?) {
        program = p
    }

    fun manage() {
        program!!.work()
    }
}
