Below is the translated Java code that performs the same logic as the provided Python code. It takes three space-separated integers as input from the standard input, processes them, and prints the result to the standard output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for X, K, and D
        int X = scanner.nextInt();
        int K = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        // Calculate the number of moves towards the origin
        int count = Math.abs(X) / D;
        int ans;
        
        // Check if the number of moves is less than allowable moves
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            // Remaining number of moves is even
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            }
            // Remaining number of moves is odd
            else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        
        // Print the answer
        System.out.println(ans);
    }
}
```

Now, you should be able to compile and run this code in Java. It accepts input in the same format as the test case provided, i.e., three integers separated by spaces, and it will output the same result as the expected output.
