Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index >= 1 && index <= nums.length) { // Ensure the input is within the array bounds
            System.out.println(nums[index - 1]); // Subtract 1 because Java arrays are zero-indexed
        } else {
            System.out.println("Index out of bounds"); // Inform the user if the input is out of bounds
        }
        scanner.close();
    }
}
```

This Java code does exactly what the Python code does: it has an array `nums` with the same integer values, and it prints the element in the array at the index provided by the user. Because Java arrays are zero-indexed, we subtract 1 from the input index (since the Python code is presumably one-indexed based on the problem statement). And as good practice, the code includes checking if the index is within the array's bounds to prevent any `ArrayIndexOutOfBoundsException` from occurring.
