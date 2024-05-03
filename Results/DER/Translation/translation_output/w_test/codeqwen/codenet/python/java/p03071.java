Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] list = {A+B, 2*A-1, 2*B-1};
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println(max);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, creates an array with the three possible results, and then finds the maximum value in the array. The maximum value is then printed to the console.
