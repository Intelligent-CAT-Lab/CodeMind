Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int towerDis = b - a;
        int bHeight = towerDis * (towerDis + 1) / 2;
        int ans = bHeight - b;

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the difference between them, and then calculates the height of the tower. Finally, it prints out the difference between the height of the tower and the second integer.
