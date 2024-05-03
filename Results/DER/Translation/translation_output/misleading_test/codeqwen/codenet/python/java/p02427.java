Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        run(n);
    }

    public static void run(int n) {
        for (int i = 0; i < (1 << n); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it generates all the subsets of that integer. For each subset, it prints the subset's index and the subset itself.
