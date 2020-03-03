# WEB-JAVA-7 - Web Applications Build and Deploy

## Practice Exercise
Add on to the repository you cloned from  https://github.com/generation-org/spring-boot
The program should take in initials for a person and their age.
And you should be able to lookup and retrieve the initials and age of a person.
Make sure to write unit tests!

Once you have tested your application, it is time to deploy.
1. Build a docker image.
The Dockerfile will not have changed from:
```
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
```
2. Deploy on heroku. 
