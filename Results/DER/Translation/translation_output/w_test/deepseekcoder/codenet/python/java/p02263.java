<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 +

Expected output:
3


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

### Response:
```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for (String str : n) {
            if (str.equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b + a);
            } else if (str.equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            } else if (str.equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b * a);
            } else {
                s.push(Integer.parseInt(str));
            }
        }
        System.out.println(s.pop());
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, and then processes each string in the array. If the string is "+", it pops the last two numbers from the stack, adds them together, and pushes the result back onto the stack. If the string is "-", it does the same but subtracts the second number from the first. If the string is "*", it does the same but multiplies the two numbers. If the string is not one of these, it converts the string to an integer and pushes it onto the stack. Finally, it pops the last number from the stack and prints it.
<|EOT|>
