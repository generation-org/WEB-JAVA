<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# WEB-JAVA-4 - REST API with Spring Boot


 <br/>
 <br/>
 
 
 ## Part 1: Create the Database Table
1. Run the following SQL scripts using MySQL Workbench:
```sql
    -- -----------------------------------------------------
    -- Schema mydb
    -- -----------------------------------------------------
    CREATE SCHEMA IF NOT EXISTS `db_example` DEFAULT CHARACTER SET utf8 ;
    USE `db_example` ;

    -- -----------------------------------------------------
    -- Table `mydb`.`Students`
    -- -----------------------------------------------------
    CREATE TABLE IF NOT EXISTS `db_example`.`Students` (
      `idStudents` INT NOT NULL,
      `name` VARCHAR(100) NULL,
      `email` VARCHAR(100) NULL,
      `address` VARCHAR(100) NULL,
      `birth_date` DATETIME NULL,
      PRIMARY KEY (`idStudents`))
   ```
2. Download the project and import it as a Gradle project into your IDE.
3. Verify the connection properties in the *application.properties* file.
3. Run the application and verify that the sample data is created from the Web Application.

## Part 2: Implementing a REST API CRUD
1. Create a new package called *controller*.
2. Create a new class called *StudentsController*.
3. Annotate the *StudentsController* with the *@RestController*.
4. Inject the *StudentService* into the *StudentsController* via the constructor:
    ```java
    private StudentService studentService;

    public StudentsController( @Autowired StudentService studentService )
    {
        StudentsApplication.studentService = studentService;
    }
    ``` 
5. Define an endpoint for each of the CRUD methods as follows:
  
   | Method Name                          | HTTP Method | Endpoint Path |
   |--------------------------------------|-------------|---------------|
   | all()                                | GET         | /student      |
   | findById(@PathVariable String id)    | GET         | /student/{id} |
   | save(@RequestBody Student student)   | POST        | /student      |
   | update(@RequestBody Student student) | PUT         | /student      |
   | delete(@PathVariable String id)      | DELETE      | /student/{id} |

6. Use Postman to test your REST API. Verify each of the CRUD operations:
* Create a new Student
* Find a Student by ID
* Get All the Students List
* Update a Student
* Delete a Student

## Challenge Yourself
1. Create an additional endpoint that lets you find all the students whose name starts with a given query parameter.
