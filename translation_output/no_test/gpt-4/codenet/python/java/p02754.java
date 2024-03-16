Below is your translated Python code to Java. The Java code reads three integers from the standard input (assuming the input is providence in the format "n a b"), then performs the calculations similar to those in the Python code, and finally prints the result to the standard output.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Reading the value of n from input
        int a = scanner.nextInt(); // Reading the value of a from input
        int b = scanner.nextInt(); // Reading the value of b from input

        int k = n / (a + b); // Calculating the whole number division part
        int p = n % (a + b); // Calculating the remainder

        System.out.println(k * a + Math.min(p, a));

        scanner.close(); // Closing the scanner
    }
}
```

Remember to import `java.util.Scanner` at the beginning of the file since it is required for reading input from the user. In Java, user input is not automatically a string, and we do not need to explicitly convert it to an int as in Python. The `Scanner` class provides methods like `nextInt()` to directly read integers.

The `Math.min()` function in Java is equivalent to the Python `min()` function to compare two values and return the smallest one.
