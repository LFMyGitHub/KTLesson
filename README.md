# KTLesson
KtLion基础语法使用

**OKHttp**   
配置文件添加网络请求权限  
gradle添加网络请求和打印日志依赖  
①通过builder构建者模式创建一个OKHttpClient对象  
②通过builder构建者模式创建一个Request对象  
③通过client.newCall(request)创建一个Call实例  
④Call实例调用execute方法发送同步请求,通过enqueue方法发送异步请求  
⑤请求返回response转换成String类型返回  
post请求与get请求区别:  
POST请求与GET请求不同的地方在于Request.Builder的post()方法,post()方法需要一个RequestBody的对象作为参数  
  
**OKHttp框架解析**  
**Android9.0动态授权源码分析**  
**Retrofit源码解析**  
**布局优化/混淆与加固/网络加解密/图片优化/内存优化**

