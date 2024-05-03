Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int b = scanner.nextInt();

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then checks if the sum of the first two integers is less than the third integer. If it is, it prints "NA". If the first integer is greater than or equal to the third integer, it prints "0". Otherwise, it prints the difference between the third integer and the first integer.
