Certainly! Here's the equivalent Java program for the Python code you provided:

```java
import java.util.Scanner;

public class XChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int a = 0;
        
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'x') {
                a++;
            }
        }
        
        System.out.println(a <= 7 ? "YES" : "NO");
        scanner.close();
    }
}
```

To run this Java program, you would compile it first and then execute the compiled class file, providing the test input `oxoxoxoxoxoxox`, which would yield the expected output `YES`.
