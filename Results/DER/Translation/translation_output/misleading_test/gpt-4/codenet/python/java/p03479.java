Here is the Java translation of the provided Python code, with a sample test case included:

```java
import java.util.Scanner;

public class DoubleCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        
        int count = 1;
        long x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }
        System.out.println(count);
    }
}
```

To match the test case provided ("3 20" as input, expecting "32" as output), you would run the program and provide the input via standard input (e.g., typing the numbers in the console). The program will then output the result to the console.
