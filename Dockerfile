FROM openjdk:11
EXPOSE 3030
ADD target/award-service.jar award-service.jar
ENTRYPOINT ["java","-jar","/award-service.jar"]