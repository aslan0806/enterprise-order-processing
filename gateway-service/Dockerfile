FROM openjdk:23-jdk-slim
ARG JAR_FILE=target/gateway-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]