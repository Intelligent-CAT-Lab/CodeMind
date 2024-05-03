Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        if (Arrays.stream(ABC).filter(x -> x == 5).count() == 2) {
            System.out.println(Arrays.stream(ABC).sum() == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, checks if there are exactly two 5s in the array, and then checks if the sum of the array is 17. If both conditions are met, it prints "YES", otherwise it prints "NO".
