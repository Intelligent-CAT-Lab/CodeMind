Below is the equivalent Java code for the provided Python script. I'm assuming you have a method in place to read integers from the console input in Java since Java doesn't have a direct counterpart to Python's `input().split()`. I'm using a `Scanner` object to read input, and I've created a separate `inpl` method to mimic the behavior of the Python function for reading an array of integers from a line of input.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = inpl(sc);
        
        int N = input[0];
        int A = input[1];
        int B = input[2];
        int C = input[3];
        int D = input[4];
        boolean found = false;
        
        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D*k - C*j >= B-A && B-A >= C*k - D*j) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("NO");
        }
    }
    
    private static int[] inpl(Scanner sc) {
        String[] parts = sc.nextLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
}
```

This Java code defines a `Main` class that reads an array of integers from the console, following the provided Python logic. All output operations and control structures have their Java-equivalent syntax. Remember to import `java.util.Scanner` for this code to work, as it uses the `Scanner` object for input reading. Let me know if you require any further adjustments or explanations.
