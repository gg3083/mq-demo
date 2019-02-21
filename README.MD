# 消息队列demo 
## 1、安装配置 
#### 1.1安装docker 
#### 1.2安装zookeeper 
    docker pull wurstmeister/zookeeper
#### 1.3安装kafka 
    docker pull wurstmeister/kafka
#### 1.4 开放端口（可忽略） 
    firewall-cmd --zone=public --add-port=2181/tcp --permanent;firewall-cmd --reload;
    firewall-cmd --zone=public --add-port=9092/tcp --permanent;firewall-cmd --reload;
#### 1.5 运行 
    docker run -d --name zookeeper --restart=always  -p 2181:2181 -t wurstmeister/zookeeper  
    docker run -d --name kafka --publish 9092:9092 \
    --link zookeeper \
    --env KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 \
    --env KAFKA_ADVERTISED_HOST_NAME={kafka所在机器ip地址} \
    --env KAFKA_ADVERTISED_PORT=9092 --restart=always \
    wurstmeister/kafka 
 #### 1.6 安装rabbitmq
     docker pull rabbitmq:3-management
     docker run -d --hostname my-rabbit --name rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
     docker run -d --hostname my-rabbit --name rabbit -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=123456 -p 15672:15672 -p 5672:5672 rabbitmq:3-management

   
