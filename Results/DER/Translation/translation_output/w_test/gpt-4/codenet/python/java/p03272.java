Here's the equivalent code in Java. The Java code reads two integers from standard input, similar to the way the Python code does, and then calculates and prints the result:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(n + 1 - i);
        scanner.close();
    }
}

```
For the given test input (4 2) this java program would output:
```
3
```
