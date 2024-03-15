Here's the translation of the provided Python code into Java. Java is more verbose and strongly typed, so the translation will be longer and require more explicit data structure declarations and manipulations:

```java
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read inputs
        int K = sc.nextInt();
        int N = sc.nextInt();
        
        // Execute logic based on the condition of K being even or odd
        if (K % 2 == 0) {
            // If K is even, print the desired sequence
            System.out.print((K / 2) + " ");
            for (int i = 1; i < N; i++) {
                System.out.print(K + " ");
            }
            System.out.println();
        } else {
            // If K is odd, construct and print the sequence as specified
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = (K + 1) / 2;
            }
            
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    N--; // Decrease the size of the array by 1 (simulate pop)
                } else {
                    X[N - 1]--;
                    for (int j = N; j < X.length; j++) {
                        X[j] = K;
                    }
                    N = X.length; // Return to original size after extension
                }
            }
            
            // Print the array
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
```

Please keep in mind that Java arrays don't have a direct equivalent to Python's `list` which can dynamically grow or shrink. To mimic the `pop` and `extend` operations from the Python code, I modified the logic slightly. In Java, typically we would use a `List`, such as an `ArrayList`, for dynamic array manipulations, but for simplicity and to stay closer to the Python code structure, I simulated the `pop` by decreasing the `N` variable and the `extend` by filling in the rest of the array with `K`.
