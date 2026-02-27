FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /app

COPY src ./src

COPY pom.xml .

RUN mvn clean install -DskipTests

FROM alpine/java:11-jdk

WORKDIR /app

COPY --from=build /app/target/*.jar sbocp.jar

EXPOSE 8081

CMD ["java", "-jar", "sbocp.jar"]