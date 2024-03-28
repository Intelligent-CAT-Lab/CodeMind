Here's the equivalent Java code:

```java
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        int num_500 = total / 500;
        int remain = total - num_500 * 500;
        int num_5 = remain / 5;

        System.out.println(num_500 * 1000 + num_5 * 5);
        scanner.close();
    }
}
```

To compile and run this Java code, you can follow these steps:

1. Save the code in a file called `CurrencyExchange.java`.
2. Compile the program using the `javac CurrencyExchange.java` command in your terminal or command prompt.
3. Run the program with the `java CurrencyExchange` command.
4. Enter the test input (`1024` in this case) as prompted, and the program will print out the expected output (`2020`).
