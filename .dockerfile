FROM openjdk:17-jdk-alpine3.14

WORKDIR /usr/src/app

COPY actions/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]