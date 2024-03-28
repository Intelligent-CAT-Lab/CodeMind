The equivalent Java code for the provided Python script would be as follows:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int result = 3 * (r * r);
        
        System.out.println(result);
        scanner.close();
    }
}
```

When you run this Java program, it will read an integer from the console (just like the Python code does with `int(input())`) and then calculate `3 * (r^2)` and print the result to the console. Remember to close the `Scanner` object after you're done to avoid resource leaks.
