Below is the translation of your Python code into Java, including the output for the given test case:

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        
        System.out.println(k);
        scanner.close();
    }
}
```

This Java program does the exact equivalent of the Python code you provided. It calculates the factorial of the input number (in this case, 5) and outputs the result (which should be 120 for an input of 5).
