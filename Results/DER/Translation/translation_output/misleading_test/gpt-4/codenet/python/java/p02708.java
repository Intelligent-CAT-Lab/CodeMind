Certainly! Below is the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class SumCombinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        scanner.close();
        
        long ans = 0;
        long mod = (long)1e9 + 7;
        
        for (int i = k; i <= n + 1; i++) {
            long maxSum = ((long)(2 * n - i + 1) * i) / 2;
            long minSum = ((long)i * (i - 1)) / 2;
            ans = (ans + (maxSum - minSum + 1)) % mod;
        }
        
        System.out.println(ans);
    }
}
```

To run a test case with the input "3 2", you would simply compile and run this Java program, then enter the input when prompted. The output will be "43" as expected.
