Here is the translated code in Java:

```java
import java.util.Scanner;

public class TupleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading and splitting the input, then parsing it as integers.
        String[] inputs = scanner.nextLine().split(" ");
        int[] ABC = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ABC[i] = Integer.parseInt(inputs[i]);
        }
        
        // Count occurrences of 5
        int countOfFive = 0;
        for (int number : ABC) {
            if (number == 5) {
                countOfFive++;
            }
        }
        
        // Check the conditions similar to the Python code
        if (countOfFive == 2) {
            // Calculate the sum of the array elements
            int sum = 0;
            for (int number : ABC) {
                sum += number;
            }
            
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```
This Java code performs the same functionality as the provided Python code. It reads a line of input, splits it by spaces, and parses the numbers into an integer array. It then counts the occurrences of the number 5 within the array, and checks if there are exactly two occurrences and if the sum of the array is 17. It prints "YES" or "NO" accordingly.
