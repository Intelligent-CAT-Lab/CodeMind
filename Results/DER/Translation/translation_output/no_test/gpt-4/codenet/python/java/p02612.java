Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 1000 != 0 ? 1000 - n % 1000 : 0);
        scanner.close();
    }
}
```

The Java version does the same thing as the Python script: it reads an integer from the standard input, calculates the remainder when that number is divided by 1000, and then prints either 1000 minus that remainder or 0, depending on whether the remainder is non-zero.
