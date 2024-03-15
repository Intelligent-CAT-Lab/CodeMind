Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```
This Java program will have the same functionality as the Python code, taking two integers as inputs and then performing the conditional logic to print the output.
