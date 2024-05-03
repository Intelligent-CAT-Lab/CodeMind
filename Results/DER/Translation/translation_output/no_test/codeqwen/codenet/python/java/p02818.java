Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            return;
        }
        System.out.println(a + " " + Math.max(b - k, 0));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, subtracts the third integer from the first, and then prints the result. If the first integer is less than or equal to the third integer, it subtracts the first integer from the third and sets the first integer to zero. If the first integer is greater than the third integer, it prints the difference between the first and third integers and the second integer.
