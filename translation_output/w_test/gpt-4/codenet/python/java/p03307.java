Here's the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}
```

The above Java code includes the necessary import of the `Scanner` class, which is equivalent to the `input()` function in Python for reading user input. The main logic for calculating the output based on whether `n` is even or odd is the same as in the Python code you provided.
