Here is the Python code translated into Java. Given the functionality, I've created a simple Java program that reads input from the standard input, computes the coin sum, and prints `1` if the sum is greater or equal to `1000`, else `0`.

```java
import java.util.Scanner;

public class CoinSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = scanner.nextInt();
        int c5 = scanner.nextInt();
        int c10 = scanner.nextInt();
        int c50 = scanner.nextInt();
        int c100 = scanner.nextInt();
        int c500 = scanner.nextInt();
        scanner.close();

        int sum = c1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500;
        
        System.out.println(sum >= 1000 ? 1 : 0);
    }
}
```

To run this Java program, ensure the input is provided in the correct format (numbers separated by spaces). The program reads the input and computes the result as per your specification.
