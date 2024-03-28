<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = input().split()
s = []
for i in range(len(n)):
    if n[i] == "+":
        a = s.pop()
        b = s.pop()
        s.append(b + a)
    elif n[i] == "-":
        a = s.pop()
        b = s.pop()
        s.append(b - a)
    elif n[i] == "*":
        a = s.pop()
        b = s.pop()
        s.append(b * a)
    else:
        s.append(int(n[i]))
print(s.pop())

```

@@ Response
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

This Java code does the same thing as the Python code. It reads a line of input, splits it into tokens, and then processes each token according to its value. If the token is a number, it pushes it onto the stack. If the token is an operator, it pops the top two numbers from the stack, applies the operator, and pushes the result back onto the stack. Finally, it prints the final result.<｜end▁of▁sentence｜>
