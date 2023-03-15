FROM amazoncorretto:11-alpine-jdk
MAINTAINER KFL
COPY target/kfl-0.0.1-SNAPSHOT kflo-app.jar
ENTRYPOINT ["java", "-jar", "/kflo-app.jar"]
