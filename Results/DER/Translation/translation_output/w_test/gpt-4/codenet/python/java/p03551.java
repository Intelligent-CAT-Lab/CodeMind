Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    scanner.close();

    int time = 1900 * M + (N - M) * 100;
    int result = time * (int)Math.pow(2, M);
    System.out.println(result);
  }
}
```

This Java code takes two integers as input and computes the expected time as described in the Python code and prints the result to the console. Make sure to run this code within a class in your Java project and import the `java.util.Scanner` for the input functionality.
