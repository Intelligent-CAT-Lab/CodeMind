Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then prints out the integers in ascending order. If the first integer is less than the second, it checks if the third integer is less than the first. If it is, it prints the third and second integers. If the second integer is less than the third, it prints the first and third integers. If the first integer is not less than the second, it does the same thing, but with the first and second integers.
