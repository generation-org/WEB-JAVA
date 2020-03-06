# Spring Boot API Sample Project

### Part 1: Creating the local database

1. Open MySQL Workbench

2. Open the Local Instance 3306 in the *MySQL Connections*

3. Create a new database running the following commands at MySQL Workbench:
    ```sql
        -- -----------------------------------------------------
        -- Schema db_example
        -- -----------------------------------------------------
        CREATE SCHEMA IF NOT EXISTS `db_example` DEFAULT CHARACTER SET utf8 ;
        USE `db_example` ;

        -- -----------------------------------------------------
        -- Table `db_example`.`Users`
        -- -----------------------------------------------------
        CREATE TABLE IF NOT EXISTS `db_example`.`Users` (
          `idUsers` INT NOT NULL,
          `name` VARCHAR(200) NULL,
          `last_name` VARCHAR(200) NULL,
          `email` VARCHAR(200) NULL,
          PRIMARY KEY (`idUsers`))
    ```
4. Insert some Users to the database
    ```sql
        INSERT INTO `db_example`.`Users` (`idUsers`, `name`, `last_name`, `email`) VALUES ('1', 'Debbie', 'Ly', 'debbie@generation.org');
        INSERT INTO `db_example`.`Users` (`idUsers`, `name`, `last_name`, `email`) VALUES ('2', 'Cleon', 'Grant', 'cleon@generation.org');
        INSERT INTO `db_example`.`Users` (`idUsers`, `name`, `last_name`, `email`) VALUES ('3', 'Carlos', 'Echeverry', 'carlos@generation.org');
        INSERT INTO `db_example`.`Users` (`idUsers`, `name`, `last_name`, `email`) VALUES ('4', 'Elise', 'Guimarães', 'elise@generation.org');
        INSERT INTO `db_example`.`Users` (`idUsers`, `name`, `last_name`, `email`) VALUES ('5', 'Ian', 'Munene', 'ian@generation.org');
        INSERT INTO `db_example`.`Users` (`idUsers`, `name`, `last_name`, `email`) VALUES ('6', 'Santiago', 'Carrillo', 'santiago@generation.org');
    ```

