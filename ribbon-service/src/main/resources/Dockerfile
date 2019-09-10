FROM java:8
MAINTAINER weipan
ENV TZ Asia/Shanghai
COPY ribbon-service-1.0.0.jar ribbon-service.jar
ENTRYPOINT ["java", "-jar", "ribbon-service.jar"]