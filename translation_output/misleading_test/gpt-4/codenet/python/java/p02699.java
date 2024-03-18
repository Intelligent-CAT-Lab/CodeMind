Here is the equivalent Java code for the provided Python snippet, including the logic to take input and print the output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

        scanner.close();
    }
}
```

To run this code with the sample test case, you would input `4 5` when the program asks for input and expect to see `unsafe` as the output.
