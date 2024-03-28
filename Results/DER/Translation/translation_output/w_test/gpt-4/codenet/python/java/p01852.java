Here is the equivalent Java code to perform the same task as the Python code given:

```java
import java.util.Scanner;

public class BinaryLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(Integer.toBinaryString(n).length());
        }
    }
}
```

This Java code expects an integer as input and prints the length of its binary representation, not including the `0b` prefix that Python's `bin` function adds (hence the subtraction by 2 in the Python code, which is not necessary in the Java code since `Integer.toBinaryString` doesn't include any prefix). If the input is 0, it simply prints 0.
