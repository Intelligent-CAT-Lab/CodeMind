Here is the Java equivalent of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = scanner.nextInt();
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, sorts them in ascending order, and then prints the sum of the first two integers.
