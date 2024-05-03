Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        if (n == 3) {
            System.out.println("bon");
        } else if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, takes the last digit of the number by using the modulus operator, and then checks if the last digit is 3, 2, 4, 5, 7, or 9. If it is, it prints "bon". If it is not, it prints "hon". If the last digit is not 3, 2, 4, 5, 7, or 9, it prints "pon".
