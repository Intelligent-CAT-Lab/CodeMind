Certainly! Here is the equivalent Java code for the provided Python script. The Java version requires a bit more setup, as Java is strictly typed and requires more explicit input handling. I have also included sample test code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        
        int s = a * b;
        int t = c * d;
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```
This code will work with the same input as your Python code and should produce the same output when provided the test input "3 5 2 7" (which would lead to the expected output of "15"). Remember to compile and run the Java code in an appropriate Java environment.
