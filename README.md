# GroovyDemo
groovy编写gradle实践

1. Plugin使用的入口是 build.gradle(:app)中的id 'com.myPlugin'
2. 通过该引用调用到com.myPlugin.properties
3. 该文件中引用目录具体到MyPlugin类
4. 该类中调起创建Extension

* 在执行./gradlew后发生了什么？
  * 先找到buildSrc文件
    * 如果没有，结束执行
    * 如果存在，找到properties文件，顺着链路编译
      编译完成，可以在build.gradle中通过id 进行调用
