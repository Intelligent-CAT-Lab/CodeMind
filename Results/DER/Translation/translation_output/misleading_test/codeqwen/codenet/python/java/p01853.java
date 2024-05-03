Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] points = new String[n];

        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        for (String point : points) {
            System.out.print(point + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, creates an array of Strings with the size of the first integer, and then fills the array with the second integer. Finally, it prints out the elements of the array separated by spaces.
