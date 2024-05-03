Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads a line of input, splits it into three parts (assuming the input is in the format "A s B"), converts the first two parts to integers, and then prints the result of the operation specified by the third part.
