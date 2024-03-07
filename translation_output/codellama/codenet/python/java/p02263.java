<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + a);
            } else if (token.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (token.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        System.out.println(stack.pop());
    }
}
```
This code uses a `Scanner` to read the input from the user, and a `Stack` to store the values and perform the calculations. The `for` loop iterates over the tokens in the input string, and performs the appropriate calculation based on the token. Finally, the result is printed to the console.</s>
