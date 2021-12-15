package com.longf.ktproject.lesson

import kotlin.system.exitProcess

//四则运算
fun main(){
    while (true){
        println("============请输入正确的运算表达式============")
        val input = readLine()
        try {
            input?.let{
                val ref = operation(input)
                println("$input = $ref")
                println("输入y/n继续或退出程序")
                val res = readLine()
                res?.let {
                    if(it == "n"){
                        exitProcess(-1)
                    }
                }
            }
        }catch (ex: Exception){
            ex.printStackTrace()
        }
    }
}

fun operation(input: String): String{
    when {
        input.contains("+") -> {
            val intputArray = input.trim().split("+")
            return arith(intputArray[0].toDouble(), intputArray[1].toDouble(), "+").toString()
        }
        input.contains("-") -> {
            val intputArray = input.trim().split("-")
            return arith(intputArray[0].toDouble(), intputArray[1].toDouble(), "-").toString()
        }
        input.contains("*") -> {
            val intputArray = input.trim().split("*")
            return arith(intputArray[0].toDouble(), intputArray[1].toDouble(), "*").toString()
        }
        input.contains("/") -> {
            val intputArray = input.trim().split("/")
            return arith(intputArray[0].toDouble(), intputArray[1].toDouble(), "/").toString()
        }
        else -> {
            return "0.0"
        }
    }
}

fun arith(num1: Double, num2: Double, oper: String): Double{
    when (oper) {
        "+" -> {
            return num1 + num2
        }
        "-" -> {
            return num1 - num2
        }
        "*" -> {
            return num1 * num2
        }
        "/" -> {
            return num1 / num2
        }
        else -> {
            return 0.0
        }
    }
}