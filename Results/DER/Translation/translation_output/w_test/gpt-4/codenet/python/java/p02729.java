Here is the Java translation of your provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;

        System.out.println(even + odd);
        
        scanner.close();
    }
}
```

When you run the program with the input `2 1`, it will produce the expected output `1`.
