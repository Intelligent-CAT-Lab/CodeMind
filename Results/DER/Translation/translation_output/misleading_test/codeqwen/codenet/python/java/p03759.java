Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java program does the same thing as your Python code. It reads three integers from the user, calculates the difference between the second and first integers, and then checks if the difference is the same as the difference between the third and second integers. If it is, it prints "YES", otherwise it prints "NO".
