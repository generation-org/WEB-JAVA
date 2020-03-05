# Spring Boot API Sample Project

In order to run this project you need to follow the next steps:

1. Install MySQL: https://dev.mysql.com/downloads/installer/

2. Connect to MySQL database as Root user:
    ```bash

      $ sudo mysql --password
    ```
3. To create a new database, run the following commands at the mysql prompt:
    ```bash
        mysql> create database db_example; -- Creates the new database
        mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
        mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database      
    ```

Reference: https://spring.io/guides/gs/accessing-data-mysql/
