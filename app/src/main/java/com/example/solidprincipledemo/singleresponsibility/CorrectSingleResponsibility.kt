package com.example.solidprincipledemo.singleresponsibility

data class UserCorrect(
    var id: Long,
    var name: String,
    var password: String
)

class AuthenticationService(){
    fun signIn(){
        // This method will do signing in operations
    }

    fun signOut(){
        // This method will do signing out operations
    }
}