package dev.qori.moviecatalogue.util

fun String.truncate(): String{
    return if(this.length>150){
        this.slice(0..150)+"..."
    }else{
        this
    }
}