Sure, here is the Java code equivalent to the provided Python code. The Java code will read an integer from the standard input and print "Yes" if the number can be expressed as a product of two integers between 1 and 9, inclusive. If not, it will print "No".

```java
import java.util.Scanner;

public class MultiplicationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean found = false;
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        
        if (!found) {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

To use the above Java program, compile and run it, then input the test value `10` when prompted. It should print out `Yes` as expected.
