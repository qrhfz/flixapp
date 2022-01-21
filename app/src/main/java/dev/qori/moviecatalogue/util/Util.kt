package dev.qori.moviecatalogue.util

fun String.truncate(): String{
    val words = this.split(" ")
    return if(words.size>20){
        words.slice(0..20).joinToString(" ")+"..."
    }else{
        this
    }
}