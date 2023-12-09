FROM eclipse-temurin:17-jdk-alpine
ADD target/devops_lab4_github-action.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]