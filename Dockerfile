FROM alpine/java:21-jdk

WORKDIR /sbapp

COPY ./target/*.jar sbocp.jar

EXPOSE 8081

CMD ["java", "-jar", "sbocp.jar"]