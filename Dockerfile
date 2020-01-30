FROM openjdk:8
EXPOSE 8081
ADD target/spring-boot-jenkin-docker-integration.jar spring-boot-jenkin-docker-integration.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkin-docker-integration.jar"]