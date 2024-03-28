Certainly! Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((n - 1) * (m - 1));
        
        scanner.close();
    }
}
```

Remember that when you run the Java program, you will have to input the numbers on the same line separated by a space (e.g., "3 4") just as you do when the input is requested by the Python code you provided. Java takes the input as a string and then uses `nextInt()` to parse integers from the string. The `Scanner` class is used to take input from the standard input (keyboard). The program calculates and prints the result in a similar way as the Python code does.
