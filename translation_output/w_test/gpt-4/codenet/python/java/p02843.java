Here's the translation of your Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int q = N / 100;
        int mod = N % 100;
        
        System.out.println(mod <= q * 5 ? 1 : 0);
    }
}
```

When you run this Java program, it will read an integer from the standard input, perform the necessary calculation, and print out `1` or `0` as determined by the logic you provided in the Python code.
