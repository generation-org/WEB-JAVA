# Docker Class Exercise - Hello World

## Creating your first Docker Image

### Step 1: Hello Docker World 
1. `git clone https://github.com/spring-guides/gs-spring-boot-docker.git`
2. Import the project into IntelliJ.
3. Take the `Application.java` file from this folder and put it into the `src/` in your project.
4. In your terminal, go to `gs-spring-boot-docker/complete`. Run from the command line:`./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar`
5. Go to localhost:8080 to see your "Hello Docker World" message.

### Step 2: Containerize It
1. Put the `Dockerfile` in this folder into your application.
2. Run in the command line `$ mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)`
3. Create your Docker image.
`$ docker build --build-arg DEPENDENCY=build/dependency -t springio/gs-spring-boot-docker .`
4. Run on docker!
`docker run -p 8080:8080 -t springio/gs-spring-boot-docker`
5. Check out your Docker World Application at http://localhost:8080.

Congratulations! You’ve just created a Docker container for a Spring Boot app! 

## Deploying your Docker Image to Heroku

1. Make sure you have a Heroku account.
2. Create your docker image from the steps above (Creating your first Docker Image).
3. Deploy on Heroku. Copy and paste each command - one at a time.
```
heroku login
heroku container:login
heroku apps:create ${YOUR_APP_NAME}
heroku container:push web --app ${YOUR_APP_NAME}
heroku container:release web --app ${YOUR_APP_NAME}
```

To see your app, go to your heroku dashboard OR on the command line: `heroku open --app ${YOUR_APP_NAME}`
