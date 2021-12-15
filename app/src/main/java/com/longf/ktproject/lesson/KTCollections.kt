package com.longf.ktproject.lesson

//kotlin容器
fun main() {
    //数组长度不可变按顺序存储在一串连续的内存段上面
    arrayOf(1, 2, 3)
    arrayOf(1, true, "2")

    //使用arrayOfNulls创建空数组,必须指定大小、类型，所以元素为空
    val arrayOfNulls = arrayOfNulls<String>(5)
    //赋值
    arrayOfNulls[0] = "element1"
    arrayOfNulls[1] = "element2"
    arrayOfNulls[2] = "element3"
    arrayOfNulls[3] = "element4"
    arrayOfNulls[4] = null

    //动态创建数组
    Array(5) { i -> (i * i).toString() }

    //字节数组
    val byteArray = ByteArray(5)
    byteArray[0] = 0

    //使用IntArray创建整形数组
    val intArray = IntArray(5)
    intArray[0] = 1
    //创建一个长度为5值全为100的IntArray
    IntArray(5){100}
    //创建一个长度为5的IntArray,it为lambda表达式专有变量
    val intArray2 = IntArray(5){it * 100}

    //for循环遍历
    for (item in intArray2){
        println(item)
    }
    //根据下标遍历
    for (i in intArray2.indices){
        println(i.toString()+"->"+intArray2[i])
    }
    //同时遍历下标和数值
    for((index, item) in intArray2.withIndex()){
        println("$index->$item")
    }
    //foreach
    intArray2.forEach { println("forEach:$it") }
    //foreach增强版
    intArray2.forEachIndexed { index, i -> println("forEach增强版:$index->$i") }

    //集合(可变/不可变)：list：有序列表、set:数据不可重复，无序、map：键值对
    //可变集合
    val mutableListString = mutableListOf<String>()
    mutableListString.add("1")
    mutableListString.add("2")
    mutableListString.add("2")
    mutableListString.add(3, "3")
    //不可变集合
    listOf("1", "2", "3")
    //可变map,初始元素用Pair封装,key值唯一
    val mutableMapString = mutableMapOf(Pair("key", "value"))
    mutableMapString["1"] = "1"
    mutableMapString["2"] = "2"
    //不可变map
    mapOf(Pair("key", "value"))
    //可变set
    val mutableSetString = mutableSetOf<String>()
    mutableSetString.add("1")
    mutableSetString.add("2")
    mutableSetString.add("2")
    for (item in mutableSetString){
        println(item)
    }
    //不可变set
    setOf("1", "2", "3")

    println(mutableListString.isEmpty())//判断集合是否为空
    println(mutableListString.contains("6"))//判断集合是否包含元素
    println(mutableListString.containsAll(mutableSetString))//判断元素是否包含集合
    println("get: ${mutableListString[0]}")//获得对应下标元素
    println("indexOf: ${mutableListString.indexOf("2")}")//元素在集合中首次出现下标
    println("lastIndexOf: ${mutableListString.lastIndexOf("2")}")//元素在集合中最后出现下标

    //迭代器
    val iterator = mutableListString.iterator()
    iterator.forEach { item -> println(item) }
    mutableListString.clear()//清除
    println(mutableListString.isEmpty())

    val mutableListString1 = mutableListOf("1", "2", "3", "4")
    mutableListString1[0] = "0" //修改下标元素
    mutableListString1.add(1, "5")//指定位置插入元素
    mutableListString1.removeAt(0)//移除指定下标元素
    //集合翻转
    mutableListString1.reverse()
    mutableListString1.forEach{ item -> println(item)}
    mutableListString1.shuffle()//随机排序
    mutableListString1.sort()//从小到大排序
    mutableListString1.sortDescending()//从大到小排序
}