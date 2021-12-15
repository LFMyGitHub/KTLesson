package com.longf.ktproject.lesson

fun main() {
    //普通类方法声明与调用
    //需先构建成员实例对象才能调用成员方法
    Person().test()
    Person.test2()

    //静态方法调用
    println(NumUtils.double(1))

    //方法中默认参数
    read(start = 2)//不传默认参数时调用方法需要使用具名参数调用

    //参数带方法
    read(1, 2, action = { "括号内传递方法返回值" })
    read(start = 2){"括号外传递方法返回值"}

    //不定长参数
    println(append('1', '2', '3'))

    val char = charArrayOf('h', 'l', 'l', 'e')
    println(append('1', '2', '3', *char))
}

//普通类
class Person {
    fun test() {
        println("成员方法")
    }

    //伴生类即普通类里面构造静态类
    companion object {
        fun test2() {
            println("伴生类")
        }
    }
}

//静态类
object NumUtils {
    fun double(num: Int): Int {
        return num * 100
    }
}

fun read(offset: Int = 0, start: Int) {
    println("read:${offset},${start}")
}

//参数右边是一个括号说明参数是一个方法类型,->后为方法参数返回值类型
fun read(offset: Int = 0, start: Int, action: () -> String) {
    val str = action()
    println(str)
}

fun append(vararg str: Char): String{
    val result = StringBuffer()
    for (char in str){
        result.append(char)
    }
    return result.toString()
}