To translate the given Python code to Java, it's necessary to replicate the functionality of the loop and the mathematical calculations, as well as handling user input and output. Here's how the Python code would look like in Java:

```java
import java.util.Scanner;

public class MaxDigitCount {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                int maxLen = Math.max(Integer.toString(i).length(), Integer.toString(n / i).length());
                result = Math.min(result, maxLen);
            }
        }
        System.out.println(result);

        scanner.close();
    }
}
```

When you run this Java program and input `10000`, it will output `3`, as expected.
