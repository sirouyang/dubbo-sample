
数据库初始化脚本 `src/main/resources/schema.sql`

修改数据库连接 `src/main/resources/application.properties`

运行提供者：`net.yestic.sample.provider.SampleProviderApplication`

运行消费者: `net.yestic.sample.webapp.SampleWebappApplication`


`curl http://127.0.0.1:8080/hello/name`

`curl http://127.0.0.1:8080/getTestModelList?minId=1&page=1&pageSize=10`