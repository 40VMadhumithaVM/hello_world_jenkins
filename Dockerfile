FROM maven:latest AS builder
WORKDIR /temp
COPY pom.xml .
COPY src ./src
RUN mvn clean install

FROM openjdk:21-slim
EXPOSE 8081
WORKDIR /temp
COPY --from=builder /temp/target/*.jar helloApp.jar
ENTRYPOINT ["java", "-jar","helloApp.jar"]