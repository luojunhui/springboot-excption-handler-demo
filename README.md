# Spring Boot 统一异常拦截 demo
拦截到异常后,输出堆栈信息以及请求参数.因项目比较简单,直接使用`System.out.println`输出信息.
仅适用于拦截`controller`下的请求,定时器之类的需要另外拦截.

# 说明
1. `ExceptionController` 拦截异常,可拦截自定义异常
2. `ApiController` 定义接口
3. `Config` 添加过滤器`RequestFilter`

# 使用
* 需要有`maven`和`java`环境
* 下载本项目,进入根目录,执行`mvn test`或者运行`Application`后测试接口
* 具体请求路径请查看单元测试`ApiControllerTest`下的方法