FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
ADD target/api-springboot.jar api-springboot-new.jar

LABEL authors="ramos"

ENTRYPOINT ["java", "jar","/springboot-githubactions-new.jar"]
