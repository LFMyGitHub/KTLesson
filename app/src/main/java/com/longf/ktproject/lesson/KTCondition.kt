package com.longf.ktproject.lesson

fun main(){
    println("maxOf:${maxOf(5, 10)}")

    eval("啦啦啦")
}

//if条件语句
fun maxOf(a: Int, b: Int): Int{
    return if(a > b){
        a
    }else {
        b
    }
}

//when条件语句
fun eval(number: Any){
    when (number) {
        is Int -> {
            println("this is int Int")
        }
        is Double -> {
            println("this is int Double")
        }
        is Float -> {
            println("this is int Float")
        }
        is Long -> {
            println("this is int Long")
        }
        is Byte -> {
            println("this is int Byte")
        }
        is Short -> {
            println("this is int Short")
        }
        else -> {
            throw IllegalAccessException("invalid argument")
        }
    }
}


