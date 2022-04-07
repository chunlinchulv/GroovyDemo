package com.example.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

// 定义plugin 实现Plugin
class MyPlugin implements Plugin<Project> {

    void apply(Project target) { // 注意：参数是Project
        def myExtension = target.extensions.create("ting",MyExtension) // 创建扩展 配置扩展名称
        target.afterEvaluate { // 在编译完成以后，执行阶段打印
            println("hello ${myExtension.name}")
        }
    }
}