Sure, here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        int a = 0;

        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }

        System.out.println(a);
        
        scanner.close();
    }
}
```

This Java program does the equivalent operations as the given Python code. It reads two integers, `n` and `k`, from the user input, initializes a variable `a` to zero, and performs a loop `n-1` times, each time updating the value of `a` with `a += a / (k - 1) + 1`. Finally, it prints out the result.
