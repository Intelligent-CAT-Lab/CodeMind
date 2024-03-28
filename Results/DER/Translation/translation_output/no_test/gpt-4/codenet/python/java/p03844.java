Certainly! Below is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        String s = input[1];
        int B = Integer.parseInt(input[2]);

        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }

        scanner.close();
    }
}
```

In the Java version, we're using the `Scanner` class to read the user input and the `split` method to break the input string into parts, then we parse the integer parts to `int` before performing the operations, much like in the Python version. One key difference is that string comparison in Java uses the `equals` method rather than `==`.
