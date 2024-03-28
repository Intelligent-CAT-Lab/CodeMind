Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int total = 1;
        int ans = 0;
        
        while (total < b) {
            ans += 1;
            total += a - 1;
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program does the same thing as the Python code: it reads two integers from the input, simulates the process described, and prints the result to the standard output.
