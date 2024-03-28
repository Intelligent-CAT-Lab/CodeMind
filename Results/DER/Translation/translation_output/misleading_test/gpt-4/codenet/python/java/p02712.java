Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: it reads an integer `N` from the standard input, then calculates the sum of all numbers from 1 to `N` inclusive that are not divisible by 5 or 3, and finally, prints the result to the standard output. Make sure to compile and run the code in a Java environment.
