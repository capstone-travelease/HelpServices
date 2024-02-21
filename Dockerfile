FROM openjdk:21

VOLUME /tmp

COPY target/*.jar HelpService-0.0.1-SNAPSHOT.jar

EXPOSE 56273
ENTRYPOINT ["java","-jar","/HelpService-0.0.1-SNAPSHOT.jar"]