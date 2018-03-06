组合一：
    UserController  +   BaseController

组合二：
    <bean class="com.liang.controller.resolver.MyExceptionResolver"/>   +   MyExceptionResolver

组合三：
    SimpleMappingExceptionResolver  +   UserController(无需继承BaseController)
