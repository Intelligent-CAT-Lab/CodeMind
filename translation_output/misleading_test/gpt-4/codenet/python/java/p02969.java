Here is the Java translation of the provided Python code along with a simple test case that can be used to verify the output:

```java
import java.util.Scanner;

public class ComputeResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int result = 3 * (r * r);
        
        System.out.println(result);
    }
}

// Test case when input is 4.
// To run the test, you can create a class with a main method to call the ComputeResult.main method or simply replace the scanner input with a predefined value.
class TestComputeResult {
  public static void main(String[] args) {
      int testInput = 4; // Sample test input
      int expectedResult = -14; // Expected output for this input (which seems incorrect as the correct output should be 3*(4^2) = 48)

      int actualResult = 3 * (testInput * testInput);
  
      System.out.println("Test Input: " + testInput);
      System.out.println("Expected Output: " + expectedResult);
      System.out.println("Actual Output: " + actualResult);
      
      // Output a message indicating if the test passed or failed.
      if (actualResult == expectedResult) {
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed! The expected output might be incorrect.");
      }
  }
}
```

Please note that in the expected output, you mentioned `-14`, which is inconsistent with applying the function `3*(r*r)` to an input of 4. The correct output should be `48` since `3*(4*4) = 3*16 = 48`. Therefore, the test case indicates a failure but mentions that the expected output might be incorrect. If `-14` was indeed a mistake, please adjust the `expectedResult` accordingly.
