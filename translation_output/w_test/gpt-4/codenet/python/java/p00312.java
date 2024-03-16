Below is the translated Python code into Java, which performs the same operation of dividing `D` by `L` and adding the remainder to the result of the integer division:

```java
import java.util.Scanner;

public class DivideAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers D and L
        int D = scanner.nextInt();
        int L = scanner.nextInt();

        // Perform the division operation as per the given Python code
        int ans = D / L + (D - L * (D / L));

        // Print the result
        System.out.println(ans);

        scanner.close();
    }
}
```

To run the above Java code, compile it and then input `10` and `5` when prompted, you should get the output `2`, which matches the expected output for the provided test case.
