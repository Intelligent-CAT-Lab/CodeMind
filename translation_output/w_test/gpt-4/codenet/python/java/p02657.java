Below is the Java translation of the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(L * R);
        scanner.close();
    }
}
```

When you run this Java program, it expects two integers as input separated by a space, just like in the provided Python code test case. When you input "2 5", the program will output "10", as expected.
