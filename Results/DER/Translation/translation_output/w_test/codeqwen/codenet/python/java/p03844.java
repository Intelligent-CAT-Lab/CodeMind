Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        String s = input[2];
        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```

This Java program does the same thing as your Python code. It reads a line of input from the user, splits it into three parts (A, s, and B), converts A and B to integers, and then performs the operation specified by s (either addition or subtraction) and prints the result.
