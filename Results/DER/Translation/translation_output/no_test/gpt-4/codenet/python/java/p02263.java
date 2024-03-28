Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split("\\s+");
        Stack<Integer> s = new Stack<>();

        for (String token : n) {
            switch (token) {
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
                    s.push(Integer.parseInt(token));
                    break;
            }
        }

        System.out.println(s.pop());

        scanner.close();
    }
}
```

This Java code replicates the functionality of the provided Python code. It evaluates a Reverse Polish Notation (RPN) expression provided via stdin. Please ensure to import the necessary class `Scanner` and `Stack` from `java.util` package for the code to work correctly.
