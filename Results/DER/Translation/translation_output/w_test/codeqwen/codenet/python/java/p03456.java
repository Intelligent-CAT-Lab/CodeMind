Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = a * 100 + b;
        int sqrtn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, concatenates them to form a new integer, and then checks if the square root of this new integer is an integer. If it is, it prints "Yes", otherwise it prints "No".
