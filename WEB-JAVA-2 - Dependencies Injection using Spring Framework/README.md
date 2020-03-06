<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# WEB-JAVA-2 - Dependencies Injection using Spring Framework


 <br/>
 <br/>
 
 
 ## Part 1: Implementing Student Service: ArrayList
 1. Download and import the project inside the [DependenciesInjection folder.](https://github.com/generation-org/WEB-JAVA/tree/master/WEB-JAVA-2%20-%20Dependencies%20Injection%20using%20Spring%20Framework/DependenciesInjection)
2. Create a new Java class *StudentServiceImpl* that implements the *StudentService* interface.
3. Implement the methods of the *StudentService* interface using an ArrayList as the internal data structure:
  ```java
   public interface StudentService
    {
        void add( Student student );

        void delete( Student student );

        List<Student> all();

        Student findById( String id );

    }
  ```
 4. Annotate the *StudentServiceImpl* with the *@Service* annotation.
 5. Add a method inside the *StudentServiceImpl* that is called inside the constructors that add some test students.
 6. Start your server by running the project on the *main* on the *DependenciesInjectionApplication* class.
 7. Verify that your implementations work by passing an existing id into the url and checking that student data is displayed in the browser.
  ```html
    http://localhost:8080/student/10
  ```
 ## Part 2: Implementing Student Service: HasMap
1. Create a new Java class *StudentServiceImplMap* that implements the *StudentService* class.
2. Implement the methods of the *StudentService* interface using a HashMap as the internal data structure.
3. Move the *@Service* annotation from the *StudentServiceImpl* to the *StudentServiceImplMap*
4. Run your project and verify that your code is using the map configuration (you can use the debugger or just add a console message with System.our.println("message")).

## Challenge Yourself
1. Open the *DependenciesInjectionApplicationTests* class and write 3 unit tests for any of the service implementations.
