Here's the equivalent Java code for the provided Python snippet, along with a simple test case to demonstrate its usage:

```java
import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countOnes(input));
        scanner.close();
    }

    public static int countOnes(String input) {
        return (int) input.chars().filter(ch -> ch == '1').count();
    }
}

// Test case with the input "101"
class CountOnesTest {
    public static void main(String[] args) {
        String testInput = "101";
        int expectedOutput = 2;
        int actualOutput = CountOnes.countOnes(testInput);
        System.out.println("Test input: " + testInput);
        System.out.println("Expected output: " + expectedOutput);
        System.out.println("Actual output: " + actualOutput);
    }
}
```

Run the `CountOnes` class to test the code with user input, and run the `CountOnesTest` class to execute the provided test case.

Note that the expected output given in the problem statement seems to be incorrect. The correct expected output for the test input "101" should be 2, as there are two '1' characters in the string "101". If the expected output is indeed intended to be 67 for the input "101", there might be a misunderstanding or a typo in the problem description.
