Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int towerDis = b - a;
        int bHeight = towerDis * (towerDis + 1) / 2;
        int ans = bHeight - b;

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the difference between them, and then uses this difference to calculate the height of the tower. Finally, it subtracts the original height of the tower from the new height and prints the result.
