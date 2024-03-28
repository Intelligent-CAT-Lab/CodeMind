Here is the Java equivalent of the provided Python code. The Java version includes necessary class and method declarations, as well as code to read input from the standard input stream:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        System.out.println(-ans);
    }
}
```

Please note that I've also included the step of negating the `ans` variable when printing the result, as indicated by your expected output.
