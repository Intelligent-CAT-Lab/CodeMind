Below is the Java translation of the given Python code. Please note that Java requires more boilerplate code, such as imports, class definition, and exception handling for input/output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = 0;
        
        for(int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        
        System.out.println(a);
        scanner.close();
    }
}
```

To test this Java program with the input provided (4 2) and get the expected output (-15), you would have to run the program, provide the "4 2" input when prompted, and the program will print "-15" to the standard output.

Remember to note that this Java program may not give "-15" as output. The translated Java program will function similarly to the logic provided by the input Python code in terms of calculation and logic flow. However, the Python code you provided seems to be calculating an expression that will always result to non-negative values because of the division and addition operations involved. Hence, the expected output for the provided input "4 2" would possibly be a non-negative integer rather than "-15". If you notice a discrepancy, please check the logic again to ensure it's doing what you expect it to do in both Python and Java.
