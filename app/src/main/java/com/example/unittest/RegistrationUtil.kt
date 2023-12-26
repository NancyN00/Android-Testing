package com.example.unittest

object RegistrationUtil {

    //this is a database of users

    private val existingUsers = listOf("Peter", "Carl")

   /**
    * the input is not valid if...
    * ... the username/password is empty
    * ... the username is already taken
    * ... the confirmed password is not same as real password
    * ... the password contains less than 2 digits
    * everything else will make valid input
   */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String,

        // || means or
    ): Boolean{
        if(username.isEmpty() || password.isEmpty()){
            return false
        }
       if (username in existingUsers){
           return false
       }
       // != means not equal //

       if (password != confirmedPassword){
           return false
       }
       if (password.count { it.isDigit() } <2 ){
           return false
       }
       return true
    }
}