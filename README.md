# dubbo-demo
## 快速开始
### 1. 启动提供者“dubbo-demo-service”
1. 拉取项目后修改“dubbo-demo-service” ，application.properties中的dubbo.registry.address;(根据具体情况配置)
2. 然后启动“DubboDemoServiceApplication”;

### 2. 启动消费者“dubbo-demo-web”
1. 拉取项目后修改“dubbo-demo-web” ，application.properties中的dubbo.registry.address;(根据具体情况配置)
2. 然后启动“DubboDemoWebApplication”;

### 3. 测试项目
访问URL如：http://localhost:8088/demo/index

页面出现“Hello, dubbo (from Spring Boot with dubbo)” 即成功。
