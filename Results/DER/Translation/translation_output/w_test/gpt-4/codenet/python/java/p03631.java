Below is the translated Python code into Java, including the input handling:

```java
import java.util.Scanner;

public class SymmetricNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n / 100;
        int j = n % 10;
        if (i == j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}

// Usage to test with an input of 575
// Should output: Yes
```

To run this Java code, you would need to compile it first and then execute the class file with a Java Virtual Machine, providing the input '575' when prompted or by using command-line arguments or input redirection techniques if you modify the code accordingly.
