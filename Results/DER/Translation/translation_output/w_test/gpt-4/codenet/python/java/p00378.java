Here's the Python code translated into Java. I have included an example input processing part where it reads from the console, specifically designed for the given test case. 

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        
        // Calculate answer
        int k = X / 1000;
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2 * B);
        }
        
        // Print the answer
        System.out.println(ans);
        
        // Close the scanner
        sc.close();
    }
}
```

To test this code, you'd compile and run the Java class and then provide an input of `180 100 2400` followed by the Enter key, and the expected output would be `460`.
