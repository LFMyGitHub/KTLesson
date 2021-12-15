package com.longf.ktproject.lesson

//Kotlin数据类型
fun main(){
    //整形默认数据类型为Int,超过取值范围默认Long
    val number = 100
    val bigNumber = 8000000000
    //主动赋值Long型
    val longNumber = 20L
    //显示声明数据类型
    val byteNumber: Byte = 1

    //浮点型,编辑器自动根据数值推断数据类型
    val doubleNumber = 3.1415928888
    //小数点十进制保留六位
    val floatNumber = 3.1415928888f

    println("floatNumber:$floatNumber")
    println("doubleNumber:$doubleNumber")

    //字符类型,声明用单引号
    val char: Char = '3'

    //布尔类型声明
    val isVisible: Boolean = false
    val isVisible2 = true

    //字符串类型变量声明
    val str = "123456789"
    val strNumber = str[2]

    //字符串模板表达式,以美元符号开始
    println("this result is $str")
    println("this result is ${str.length}")

    //字符串拼接
    println("I am" + 10 + "years old!")

    //转转义字符 \n换行 \转义
    println("I am" + "\n" + "years old!")
    println("{\"key\":\"value\"}")

    //三个双引号包起来内部不需要转义,trimMargin去除前导空格
    val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |{"key1": "value1"}
        |{"key2": "value2"}
    """.trimMargin()
    println(text)

    //数据类型间的强制转换
    val numberInt = 3.14156789524
    println(numberInt.toFloat())

    //四则运算
    println(3+2)
    println(3-2)
    println(3*2)
    println(3/2)
    println(3/2.toDouble())
    println(3%2)

    //位运算 与、或、非、无符号右移动
    println(true.and(false))
    println(true.or(false))
    //0000 1000->0000 0010
    println(8.ushr(2))
}