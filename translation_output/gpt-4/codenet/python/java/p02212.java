Here is the Python code translated into Java:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input and convert to integer array
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        // Sort the array
        Arrays.sort(numbers);
        
        // Calculate the absolute difference and print it
        int result = Math.abs((numbers[0] + numbers[3]) - (numbers[1] + numbers[2]));
        System.out.println(result);
        
        scanner.close();
    }
}
```

This Java code performs the same operation as the given Python code: it takes a line of input, splits the string into individual numbers, converts them into integers, sorts them, and calculates the absolute difference between the sum of the first and fourth numbers and the sum of the second and third numbers, finally printing out the result.
