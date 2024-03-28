Here is the Python code translated into Java, including a main method to run a simple test case:

```java
import java.util.Scanner;

public class TestSequence {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println(nums[index]);
        
        scanner.close();
    }
}
```

To run the code, compile `TestSequence.java` with a Java compiler and run the Java program. When prompted, enter the test input (e.g., 6) to get the expected output (e.g., 2).
