Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then it loops through all possible combinations of `i` and `j` (where `i` ranges from 0 to 24 and `j` ranges from 0 to 19) and checks if the sum of `4*i + 7*j` equals the input number `N`. If it finds such a pair of `i` and `j`, it prints "Yes" and exits the program. If it doesn't find such a pair, it prints "No".
