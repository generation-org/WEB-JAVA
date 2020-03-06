<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# WEB-JAVA-3 - Spring Data JPA


 <br/>
 <br/>
 
 
 ## Part 1: Creating the database
1. Open MySQL Workbench and create a new Database with the following tables:
* Products (id, name, description, price)
* Sales (id, description, total)
2. Add a many-to-one relationship from the *Sales* table to the *Products* table
3. Export your database and run the SQL scripts to create the tables in your localinstance of MySQL
4. Insert some sample data into each table

## Part 2: Create a Spring Boot project
1. Go to the [Spring Initializr](https://start.spring.io) and create a new Gradle project with Java.
2. Import the project into IntelliJ Idea and add the following dependencies to the *build.gradle* file:
   ```gradle
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'mysql:mysql-connector-java'
   ```
3. Create new package called data.entity and implement an Entity for each of the tables (Products and Sales). Use the following code to map the one-to-many relationship:
   ```java
     @OneToMany(mappedBy = "sale", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Product> pages;
   ```
4. Define a Repository interface for each Entity:

   ```java
   public interface ProductsRepository extends CrudRepository<Product, Integer>
   {
   }
   public interface SalesRepository extends CrudRepository<Sales, Integer>
   {
   }
   ```
5. Create a SalesService interface:
    ```java
   public interface SalesService
    {
        Sale getSale( int id );
    }
   ``` 
6. Create a SalesServiceImpl that implements the SalesService interface:
    ```java
   @Service
   public class SalesServiceImpl implements SalesService
    {
      private final SalesRepository salesRepository;

      public SalesServiceImpl( SalesRepository salesRepository )
      {
          this.salesRepository = salesRepository;
      }
      
       @Override
       public Sale getSale( int id )
       {
         Optional<Sale> sale = salesRepository.findById( id );
         return user.orElse( null );
       }
   ``` 

7. Create a controller package and create the SalesController:
    ```java
    @CrossOrigin( "*" )
    @RestController
    public class SalesController
    {

    private final SalesService salesService;

    public SalesController( @Autowired SalesService salesService )
    {
        this.salesService = salesService;
    }

    @GetMapping( "/sales/{id}" )
    public Sale getSale( @PathVariable String id )
    {
        return salesService.getSale( Integer.parseInt( id ) );
    }

   ``` 
   
7. Run your project and verify it works by opening the following URL into your browser:

    ```html
       http://localhost:8080/sales/1
    ```
    
## Challenge Yourself
1. Create another method into the SalesService and SalesController to retrieve all the products that belong to a given sale ID.
