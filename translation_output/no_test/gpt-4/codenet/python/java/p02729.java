Below is the translated Python code into Java, enclosed within the ```java``` markup:

```java
import java.util.Scanner;

public class EvenOddPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;

        System.out.println(even + odd);
    }
}
```

Explanation of changes made during translation:

1. Java requires explicitly declaring the type for each variable, so we declare `n` and `m` as integers.
2. We used Java’s `Scanner` class to read input from the user. Note that in Java, we typically close the scanner after it's no longer needed.
3. Java uses the single forward slash `/` for integer division instead of the `//` used in Python.
4. Java uses `System.out.println` to print to the console.
