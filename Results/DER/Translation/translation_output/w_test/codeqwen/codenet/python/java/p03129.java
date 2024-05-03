Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N % 2 == 0) {
            if (N / 2 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if ((N / 2) + 1 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if the first integer is even or odd. If it's even, it checks if the second integer is greater than or equal to half of the first integer. If it's odd, it checks if the second integer is greater than or equal to half of the first integer plus one. If the second integer is greater than or equal to the required value, it prints "YES", otherwise it prints "NO".
