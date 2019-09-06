FROM java:8 AS JDK8
MAINTAINER weipan
ENV TZ Asia/Shanghai

FROM JDK8 AS EUREKA-SERVER
COPY eureka-server-1.0.0.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]