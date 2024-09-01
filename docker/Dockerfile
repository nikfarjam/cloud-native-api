FROM bellsoft/liberica-openjdk-alpine:21.0.4-cds

WORKDIR /home
COPY ./build/libs/node-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/home/app.jar" ]