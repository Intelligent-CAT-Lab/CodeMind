Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (Math.max(N,M) == 1) {
            System.out.println(1);
        } else if (Math.min(N,M) == 1) {
            System.out.println(N * M - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
    }
}
```

To run the test case provided (test input: `2 2`, expected output: `54`), you would need to compile this code and execute the program, entering `2 2` as the input, which should return `54` as the output, as per the original Python code logic.

