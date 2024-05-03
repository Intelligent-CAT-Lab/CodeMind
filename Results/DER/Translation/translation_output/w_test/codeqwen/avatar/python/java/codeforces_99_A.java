Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\.");
        if (Integer.parseInt(num[0].substring(num[0].length() - 1)) == 9) {
            System.out.println("GOTO Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, splits it into two parts at the decimal point, and then checks the last digit of the first part and the first digit of the second part. If the last digit is 9, it prints "GOTO Vasilisa.". If the first digit of the second part is 5 or more, it prints the first part of the number incremented by 1. Otherwise, it prints the first part of the number.
