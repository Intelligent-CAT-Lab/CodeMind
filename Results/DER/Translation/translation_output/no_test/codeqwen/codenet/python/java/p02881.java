Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = (int) Math.sqrt(n);
        while (i > 0) {
            if (n % i == 0) {
                System.out.println(i + " " + n / i);
                break;
            }
            i--;
        }

        int sum = i + n / i - 2;
        System.out.println(sum);
    }
}
```

This Java code does the same thing as your Python code. It first reads an integer from the user, then finds the largest integer less than or equal to the square root of the input number, and checks if the input number is divisible by this integer. If it is, it prints the integer and the quotient, then breaks the loop. After finding the pair of integers, it calculates the sum of these two integers and the quotient, subtracts 2 from the sum, and prints the result.
