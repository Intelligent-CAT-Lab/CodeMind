Here is the equivalent code in Java:

```java
import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = scanner.nextInt();
        int c5 = scanner.nextInt();
        int c10 = scanner.nextInt();
        int c50 = scanner.nextInt();
        int c100 = scanner.nextInt();
        int c500 = scanner.nextInt();
        
        int sum = c1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500;
        System.out.println(sum >= 1000 ? 1 : 0);

        scanner.close();
    }
}
```

Make sure you include the `java.util.Scanner` package to use the Scanner class, which allows you to read from standard input. Note that unlike Python, in Java, the variables have to be declared with their data types, and you have to compile and run the Java code using the Java compiler (`javac`) and the Java interpreter (`java`), respectively.
