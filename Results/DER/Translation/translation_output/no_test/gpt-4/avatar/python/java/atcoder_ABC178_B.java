Certainly! Below is the translated code from Python to Java:

```java
import java.util.Scanner;
import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputs = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);
        
        int ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        
        System.out.println(ans);

        scanner.close();
    }
}
```

This Java code uses a `Scanner` to read input from the standard input, similar to how `input().split()` is used in Python. The `map(int, input().split())` function in Python is replaced by `Integer.parseInt` for each input string. Java's `Math.max()` method is used to find the maximum of the given expressions.
