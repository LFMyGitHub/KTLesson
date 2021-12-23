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
*Android系统屏幕UI刷新机制*  
16ms及60帧->用户无法感知超过60帧画面刷新  
刷新率(HZ一秒内刷新屏幕的次数,越高越好)  
帧率(FPS GPS一秒内操作画面的次数,越高越好)  
*布局优化(merge/include/ViewStub)*  
①尽量多使用RelativeLayout和LinearLayout,不要使用绝对布局AbsoluteLayout  
②在布局层次一样的情况下,建议使用LinearLayout代替RelativeLayout,因为LinearLayout性能要稍高一点  
③完成相对较复杂的布局时,建议使用RelativeLayout,RelativeLayout可以简单实现LinearLayout嵌套才能实现的布局  
④将可复用的组件抽取出来并通过include标签使用  
⑤使用ViewStub标签来加载一些不常用的布局  
⑥动态地inflation view性能要比SetVisiblity性能要好,当然用ViewStub是最好的选择  
⑦使用merge标签减少布局的嵌套层次  
⑧去掉多余的背景颜色  
⑨对于使用Selector当背景的Layout,可以将normal状态的color设置为”@android:color/transparent”,来解决对应的问题  
⑩内嵌使用包含layout_weight属性的LinearLayout会在绘制时花费昂贵的系统资源,因为每一个子组件都需要被测量两次(多层嵌套会导致指数增长)
保证Layout宽而浅,而不是窄而深  
一个View要绘制到屏幕上,会经历onMeasure、onLayout、onDraw三个阶段,要探讨它们的性能问题,就是比较这三个阶段的执行时间的长短  
RelativeLayout与LinearLayout中onLayout、onDraw的执行时间基本一致,onMeasure的执行时间LinearLayout比RelativeLayout要短很多  
由于RelativeLayout是基于相对位置的,而且子View会在横向和纵向两个方向上分布,因此需要在横向和纵向分别进行一次measure过程  
LinearLayout只进行横向或者纵向的measure.但是LinearLayout会避开设置过weight属性的view做一次measure,然后再对设置过weight属性的view做第二次measure.也就是说,设置了weight属性的LinearLayout的绘制效率比没有设置的要差,也要measure两次  
*原生View控件优化*    
listView优化  
①convertView的复用  
②ViewHolder的使用  
③分段加载,即一次加载N条数据(数据量大的时候同样会导致OOM)  
④分页加载(item复用)  
webView优化  
https://tech.meituan.com/2017/06/09/webviewperf.html  


