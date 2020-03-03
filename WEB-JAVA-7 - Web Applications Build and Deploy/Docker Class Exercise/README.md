# Docker Class Exercise - Hello World

## Creating your first Docker Image

### Step 1 
1. `git clone https://github.com/spring-guides/gs-spring-boot-docker.git`
2.  Import the project into IntelliJ
3. Take the `Aplication.java` file from this folder and put it into the `src/` in your project.
4. Run the application through IntelliJ or through the command line with this command `./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar`
5. Go to localhost:8080 to see your "Hello Docker World" message.

### Step 2 Containerize It
1. Put the `Dockerfile` in this folder into your application
2. Build in IntelliJ or from the command line `$ mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)`
3. Create your Docker image
`$ docker build --build-arg DEPENDENCY=build/dependency -t springio/gs-spring-boot-docker .`
4. Run on docker!
`docker run -p 8080:8080 -t springio/gs-spring-boot-docker`

5. Check out your Docker World Application at http://localhost:8080

Congratulations! You’ve just created a Docker container for a Spring Boot app! 
