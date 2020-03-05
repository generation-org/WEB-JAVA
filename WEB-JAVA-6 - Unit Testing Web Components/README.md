# WEB-JAVA-6 - Unit Testing Web Components

### Download and Load Repo
1. Clone repo. 
2. Import project Math Application into IntelliJ.

### Reading the repository

1. Take 15 minutes to understand the code in the repository.
2. Once you have a clear understanding, talk to a partner about what the code does and its structure.

### Writing Tests in MathApplicationTest.java
1. Write 3 additional test cases to test the `add` functionality.

2. Write test cases in a new method called `testSubtract()` that tests the subtract method.

3. Write 3 test cases that verify whether a mock method is being called with required arguments,
i.e. 
```
when(calcService.add(10.0,20.0)).thenReturn(30.00);

verify(calcService).add(10.0, 20.0);
```

Add this import to the top of your program to be able to use `verify`.
```
import static org.mockito.Mockito.verify;
```

4. Write test cases that check on the number of calls that can be made on a particular method (*Hint*: Use the times or never keyword).
Add these imports to the top of the program to be able to use `times` or `never`.
```
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
```

5. Write test cases to cover when exceptions will be thrown.

### Writing Tests in CalculatorTest.java

You are tasked with designing a calculator with basic functionalities (add, subtract, multiply, and divide). We want to be able to test all the calculator functionalities. Fill in the implementation of `Calculator` in `CalculatorTest` and test each method you have created.
