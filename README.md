### litecase


### Record


参考文章: https://www.cnblogs.com/kenx/p/15124588.html


```text
SpringBoot 2.3.12.RELEASE
META-INF/spring.factories

SprintBoot 2.7的新特性
META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 配置了还需要在启动类所在的项目中通过dependency的方式引入，才有效

resources下的文件夹需要一个一个创建，不能通过 ‘.’ 的方式连续创建

然后需要在启动类所在的项目中添加模块依赖项
```