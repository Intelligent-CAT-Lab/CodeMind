Below is the translated Java code from the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input and split by space
        String[] input = scanner.nextLine().split(" ");
        
        // Parse the inputs to integers
        int[] S = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            S[i] = Integer.parseInt(input[i]);
        }
        
        // Find the index of the maximum value
        int maxIndex = 0;
        for (int i = 1; i < S.length; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Print the result based on the index of the max value
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }

        scanner.close();
    }
}
```

Note that in Java, you need to use a `Scanner` to read from standard input, and you need to manually parse the input into an array of integers. Additionally, Java does not have a built-in function for finding the index of the maximum value in an array, so you have to write the logic explicitly with a loop to compare values.
