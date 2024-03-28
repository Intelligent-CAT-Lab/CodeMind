Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integers separated by a space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
        
        scanner.close();
    }
}
```

This Java program replicates the functionality of the Python code you've provided. It reads two integers from the user, compares them, and prints the result accordingly.
