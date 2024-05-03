Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (A + B < C + D) {
            System.out.println("Right");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, and then checks if the sum of the first two integers is less than the sum of the last two integers. If it is, it prints "Right". If the sum of the first two integers is equal to the sum of the last two integers, it prints "Balanced". If neither of these conditions is met, it prints "Left".
