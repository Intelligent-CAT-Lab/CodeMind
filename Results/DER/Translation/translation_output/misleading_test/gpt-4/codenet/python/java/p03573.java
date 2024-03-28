Certainly! Below is the Java equivalent of the Python code provided. This code reads three integers from standard input and prints one of them based on the given conditions.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
```

To run the code with the test input provided "5 7 5" using a command line interface, you can execute this Java program and it will wait for input. Enter the numbers separated by spaces, then hit enter. The expected output will be "7", as per the logic provided in the Python code.
