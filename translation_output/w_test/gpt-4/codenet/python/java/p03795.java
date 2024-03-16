Certainly! Below is the given Python code translated to Java, along with sample usage:

```java
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int totalCost = 800 * N - 200 * (N / 15);
        System.out.println(totalCost);
        scanner.close();
    }
}
```

To use the above Java program, you need to compile and run it. When you run this program, it waits for input from the user. Upon receiving the input `20`, the program should output `15800`, exactly as expected from the original Python script. Make sure to provide the input without quotes or additional characters and to press Enter after you've typed the number.
