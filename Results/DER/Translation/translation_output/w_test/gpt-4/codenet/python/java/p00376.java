Certainly! Below is your translated Python code into Java. To handle input, we'll use the `Scanner` class. And for output, we'll utilize `System.out.println`.

```java
import java.util.Scanner;

public class DifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }

        scanner.close();
    }
}
```

To test the program, you can run it and input `20 30` following by pressing Enter. It should output `10` as expected.
