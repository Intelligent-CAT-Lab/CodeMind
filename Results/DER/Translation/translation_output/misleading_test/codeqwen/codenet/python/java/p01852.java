Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n > 0 ? Integer.toBinaryString(n).length() - 1 : 0);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, converts it to binary, and then prints the length of the binary string minus one. If the input is zero, it prints zero.
