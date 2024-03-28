Certainly! Here's the equivalent Java code for the Python snippet provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = (input / 500) * 500;
        System.out.println(output);
        scanner.close();
    }
}
```

This Java program reads an integer from standard input, performs integer division by 500 and then multiplies by 500 to round it down to the nearest 500, and then prints the result to standard output. When you provide 5700 as test input, the expected 5500 is the output.
