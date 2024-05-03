Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for (String i : n) {
            if (i.equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b + a);
            } else if (i.equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            } else if (i.equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b * a);
            } else {
                s.push(Integer.parseInt(i));
            }
        }
        System.out.println(s.pop());
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, and then uses a stack to perform the operations. The stack is implemented using the `Stack` class from the `java.util` package. The `Scanner` class is used to read the input.
