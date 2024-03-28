Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if (0 < a && a < 10 && 0 < b && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }

        sc.close();
    }
}
```

This Java code does the following:
1. It imports the Scanner utility for input.
2. It reads the line of input and splits it into two strings based on the space.
3. It parses the two strings to integers.
4. It then checks the condition similar to the one in the Python code.
5. It prints out the product of `a` and `b` if the condition is satisfied; otherwise, it prints "-1".
6. Finally, it closes the scanner to prevent resource leak.
