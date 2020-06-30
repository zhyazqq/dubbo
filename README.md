### 注意事项
# dubbo-admin
### 1 项目下载地址
     https://github.com/apache/dubbo-admin.git

### 2 项目构建
    1 build
    mvn clean package
    2 start
    mvn --projects dubbo-admin-server spring-boot:run
    或者
    cd dubbo-admin-distribution/target; java -jar dubbo-admin-0.1.jar
###### ps 如果 项目运行端口默认为8080 可能存在冲突 注意修改
# spring-boot + dubbo
### 1 生产者配置文件  ----  yml格式
    spring:
      application:
        name: hello-dubbo-service-user-provider
    user:
      service:
        version: 1.0.0
    server:
      port: 8081
    dubbo:
      check: false
      application:
        name: demo-provider
      registry:
        address: zookeeper://127.0.0.1:2181
      protocol:
        name: dubbo
        port: 8888
      server: true
      scan:
        base-packages: com.example.provider.service
    management:
      endpoint:
        dubbo:
          enabled: true
        dubbo-shutdown:
          enabled: true
        dubbo-configs:
          enabled: true
        dubbo-services:
          enabled: true
        dubbo-references:
          enabled: true
        dubbo-properties:
          enabled: true
    
      health:
        dubbo:
          status:
            defaults: memory
            extras: load,threadpool
#### 注意事项
    在启动类 上加上@DubboComponentScan(basePackages = "com.example.provider.service.impl")
    其中 com.example.provider.service.impl 为service路径
### 消费者配置文件 --yml
    server:
      port: 8082
    dubbo:
      check: false
      application:
        name: demo-consumer
        qos-port: 22223
        qos-enable: true
      registry:
        address: zookeeper://127.0.0.1:2181
    management:
      endpoint:
        dubbo:
          enabled: true
        dubbo-shutdown:
          enabled: true
        dubbo-configs:
          enabled: true
        dubbo-services:
          enabled: true
        dubbo-references:
          enabled: true
        dubbo-properties:
          enabled: true
    
      health:
        dubbo:
          status:
            defaults: memory
            extras: load,threadpool
#### 注意事项
    在启动类上加@EnableDubbo(scanBasePackages = "com.example.consumer.controller")
    其中 com.example.consumer.controller 为消费者 controller 包
    
