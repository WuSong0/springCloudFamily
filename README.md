# springCloudFamily
微服务架构初探
1个eureka微服务注册中心
1个config配置中心
1个hystrix-dashboard监控仪表
1个turbine监控日志收集器
1个zuul路由器
3个web应用

# 启动应用
先启动eureka注册中心，
再启动config配置中心，
再启动zuul路由器，
接着启动3个web应用，
最后启动turbine监控日志收集器和dashboard监控仪表。

# 访问
http://localhost:7001  eureka web管理

localhost:7002/we1/hello 
localhost:7002/we2/hello 
localhost:7002/we3/hello   体验微服务各个web应用，7002作为外部统一访问端口，由zuul根据请求路由到各个微服务

localhost:7003/hello 
localhost:7004/hello 
localhost:7005/hello 
是各个单独的web应用,可以单独查看和测试使用
