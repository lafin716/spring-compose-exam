FROM amazoncorretto:11-alpine-jdk

ARG JAR_FILE_PATH=build/libs/*.jar

COPY ${JAR_FILE_PATH} app.jar

ENV PROFILE=local

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "-Dspring.profiles.active", "${PROFILE}"]