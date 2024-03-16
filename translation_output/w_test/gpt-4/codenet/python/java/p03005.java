Here is the equivalent Java code for your Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Logic equivalent to the Python code
        if(K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }

        scanner.close();
    }
}
```

To use the Java code, you can compile it and then run it, providing an input similar to the one you've described in the test case:

`3 2`

And you should get the expected output:

`1`
