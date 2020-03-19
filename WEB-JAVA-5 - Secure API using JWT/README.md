<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# WEB-JAVA-5 - Secure API using JWT


 <br/>
 <br/>
 
 
 ## Part 1: Implementing Courses Controller
 
 1. Download the base project and import it as a gradle project into your favorite IDE.
 2. Open the CourseController and implement the following methods: 
  ```java


     @PostMapping( "/api/courses" )
     public Course save( @RequestBody Course course ){
         return null;
     }

     @DeleteMapping( "/api/courses/{courseId}" )
     public void delete( @PathVariable String courseId ){

     }
  ```
 3. Test your Controller using Postman (don't forget to generate a token and add it to the request as Authorization header).
 
 ## Part 2: Implementing Students Sercure API
1. Create a new model called *Student* inside the model package with the following information:
   * Id
   * Name
   * Email

2. Define a new interface inside the service package called *StudentService* with the following methods:
   ```java   
    public interface StudentService
    {

       List<Student> all();

       Student save(Student student);

       void delete(String studentId);

   }   
   ```
3. Create an implementation of the *StudentService* interface and annotate it with *@Service*.
4. Create a new controller inside the controller package called *StudentController*.
5. Inject the *StudentService* inside the *StudentController* via de constructor.
6. Implement the endpoints to handle each request to fulfill the services defined on the *StudentService* interface.
7. Make sure your endpoints start with "/api" so they can be secured by the JWT Filter interceptor.
8. Test your API using Postman.

## Challenge Yourself
Implement an additional endpoint method and service to enroll a student into a course.



 
 

