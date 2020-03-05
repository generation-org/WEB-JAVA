# WEB-JAVA-7 - Web Applications Build and Deploy

## Practice Exercise
Deploy the git repo:  https://github.com/generation-org/spring-boot.

Now that we have a working database for users, we want to store and be able to retrieve more information about people.
The program should take in initials for a person and their age.
You should also be able to lookup and retrieve the initials and age of a person.

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
2. Deploy on heroku using the following commands. Replace `${YOUR_APP_NAME}` with the name of your application.

```
heroku login
heroku container:login
heroku apps:create ${YOUR_APP_NAME}
heroku container:push web --app ${YOUR_APP_NAME}
heroku container:release web --app ${YOUR_APP_NAME}
```

Go to the heroku dashboard and see your hosted site!
