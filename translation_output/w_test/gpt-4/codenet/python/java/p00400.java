Certainly! Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if ((n >= 65) && (n <= 90)) {
            System.out.println("1");
        } else if ((n >= 97) && (n <= 122)) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}
```

To run the test case with input '67', you would need to compile the Java program and then run it, providing '67' as an input on the console. The expected output would be '1', as in your example.
