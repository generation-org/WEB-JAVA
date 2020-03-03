FROM gradle:6.2.0-jdk8 as builder
VOLUME /tmp
RUN mkdir /work
COPY . /work
WORKDIR /work
RUN gradle build
RUN mv /work/build/libs/*.jar /work/app.jar
FROM openjdk:8-jdk-alpine
COPY --from=builder /work/app.jar /work/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/work/app.jar"]
