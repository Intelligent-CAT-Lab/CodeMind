Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        int d = Integer.parseInt(numbers[3]);
        int flag = 0;
        if (a == b && c == d) {
            flag = 1;
        } else if (a == c && b == d) {
            flag = 1;
        } else if (a == d && b == c) {
            flag = 1;
        } else {
            flag = 0;
        }
        if (a == b && a == c && a == d) {
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, checks if they are equal in pairs, and then checks if all four integers are equal. If they are, it prints "Yes", otherwise it prints "No".
