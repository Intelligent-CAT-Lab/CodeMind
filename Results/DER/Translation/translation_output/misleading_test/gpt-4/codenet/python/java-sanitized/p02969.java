import java.util.Scanner;

public class p02969 {
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
          System.out.println("Test Failed!