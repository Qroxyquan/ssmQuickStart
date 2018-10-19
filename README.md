#### 减少重复搭建SSM的的工作
每次做一个ssm项目都要配置配置文件。于是此次手动做一个根据个人习惯配置的
基于maven构建工具：

#### -----WEB-INF

web.xml  web工程的入口

         --前台传入数据的乱码处理过滤器(设置初始化编码  init-parm)

         --spring容器的监听器(设置配置文件的初始化  context-parm)

         --springmvc的核心控制器

  lib 存放jar包

            这里因为采用maven作为包管理工具，开发过程中是不用理会的。
             除非要导入本地jar包

 

src下为controller,service,dao,pojo,util



#### Spring有关的         applicationContext.xml

     ----service的包扫描

     ----数据源的配置(加载   aplication.properties)

     ----事务管理器的配置(配置数据源)

     ----spring的aop(通知+切面(通知+切点表达式(织入)))

     ----mybatis的会话工厂和配置数据源(applicationContext-datasource)

     ----mybatis所在dao层的包扫描

#### SpringMVC有关的  spring-mvc.xml

     ----controller层的包扫描

     ----视图解析器(配置前缀和后缀 InternalResourceViewResolver)

     ----开启注解驱动(mvc:annotation-driven)

大概结构就是这样，有时间再做详细说明。