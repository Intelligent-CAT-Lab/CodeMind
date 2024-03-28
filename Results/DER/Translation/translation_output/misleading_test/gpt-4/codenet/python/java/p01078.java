Here is the equivalent Java code, which also includes reading the input from the standard input and writing the output to the standard output:

```java
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read N and K from input
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        // Constants
        final double PI = 3.1415926535897932384626433832795;

        // Calculate the area and print the result
        double area = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.println(area);
    }
}
```

This code assumes that you have a class named `Star` and that the `main` method is the entry point of the program, which is the standard convention in Java. You must compile this code with a Java compiler and then run the compiled class file. During execution, you would provide the input "5 2" without quotes, and the program should output the expected result.
