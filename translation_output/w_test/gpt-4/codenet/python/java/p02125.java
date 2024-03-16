Below is the translated version of the Python code into Java. Your Java program will use a `Scanner` to read the input from the user, and then perform the same logic as in the Python code to calculate the `ans` value.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans += 1;
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

When you run the Java program with the input `2`, the expected output will be `1`, just like the original Python code.
