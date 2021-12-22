package com.longf.ktproject.lesson

import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit

object HiOkHttp{
    val client = OkHttpClient.Builder()     //builder构造者设计模式
        .connectTimeout(10, TimeUnit.SECONDS)       //连接超时时间
        .readTimeout(10, TimeUnit.SECONDS)      //读超时
        .writeTimeout(10, TimeUnit.SECONDS)     //写超时
        .build()

    val request = Request.Builder()
        .url("")
        .build()

    val call = client.newCall(request)
    val response = call.execute()
    val body = response.body?.string()
}

fun main(){
    val BASE_URL = "http://123.56.232.18:8080/serverdemo"

    val client = OkHttpClient.Builder()     //builder构造者设计模式
        .connectTimeout(10, TimeUnit.SECONDS)       //连接超时时间
        .readTimeout(10, TimeUnit.SECONDS)      //读超时
        .writeTimeout(10, TimeUnit.SECONDS)     //写超时
        .build()

    val request = Request.Builder()
        .url("$BASE_URL/user/query?userId=1600932269&phone=10086&pwd=10010")
        .build()
    val call = client.newCall(request)
    Thread(Runnable {
        val response = call.execute()
        val body = response.body?.string()
        println("get response$body")
    }).start()
}