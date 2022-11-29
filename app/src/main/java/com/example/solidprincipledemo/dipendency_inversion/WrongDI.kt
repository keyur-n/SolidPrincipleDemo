package com.example.solidprincipledemo.dipendency_inversion

class Program {
    fun work() {
        // ....code
    }
}
class SuperProgram {
    fun work() {
        //....code
    }
}

class Engineer {
    var program: Program? = null
    fun updateProgram(p: Program) {
        program = p
    }

    fun manage() {
        program!!.work()
    }
}