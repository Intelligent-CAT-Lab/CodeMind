Here's the Python code translated into Java. Note that in Java, input is usually taken from the console using a `Scanner` object, and there is no direct built-in for `gcd`. However, since Java 8, you can use the `gcd` method from the `BigInteger` class. I also used the `System.in` to simulate the `input()`.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int i = n / 100;
        int j = n % 10;
        
        if (i == j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

In this code snippet, I have assumed that we are only interested in the specific functionality provided by the Python code. I have not included the unused imports and functions from your Python script, such as `bisect`, `math`, itertools, `Counter`, and `deque`, because they are not part of the core logic being translated and would unnecessarily complicate the Java equivalent. Additionally, `gcd` is imported but not used in the Python code provided, so it has been omitted from the Java translation as well.
