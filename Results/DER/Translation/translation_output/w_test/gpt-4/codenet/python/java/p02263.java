Here's the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n.length; i++) {
            switch (n[i]) {
                case "+":
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b + a);
                    break;
                case "-":
                    a = s.pop();
                    b = s.pop();
                    s.push(b - a);
                    break;
                case "*":
                    a = s.pop();
                    b = s.pop();
                    s.push(b * a);
                    break;
                default:
                    s.push(Integer.parseInt(n[i]));
                    break;
            }
        }

        System.out.println(s.pop());
        scanner.close();
    }
}
```

This Java program uses a `Stack<Integer>` instead of a Python list for the stack operations. It uses a `Scanner` to read the input line and a `switch` statement to handle each operation. The `pop` and `push` operations of the `java.util.Stack` class are used for adding and removing elements from the stack.
