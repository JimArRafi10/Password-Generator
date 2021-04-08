package com.example.passwordgenerator

import java.lang.StringBuilder

class Passwordgenerator {

    private val characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()?<>"

    fun generatePassword(length: Int, specialword: String=""): String {
        val sb= StringBuilder(length)

        for(x in 0 until length){
            val random=(characters.indices).random()
            sb.append(characters[random])
        }
        sb.insert((0 until  length).random(), specialword)
        return sb.toString()
    }

}