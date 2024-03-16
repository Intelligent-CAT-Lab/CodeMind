Certainly! Below is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
```

Make sure to import `java.util.Scanner` to be able to read input from the console. The for-loops and if-condition are very similar to Python but with Java's syntax. The print statement in Python is replaced by `System.out.println()` in Java.
