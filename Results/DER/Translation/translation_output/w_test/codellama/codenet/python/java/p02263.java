<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int a = result;
                int b = Integer.parseInt(tokens[i + 1]);
                result = a + b;
                i++;
            } else if (tokens[i].equals("-")) {
                int a = result;
                int b = Integer.parseInt(tokens[i + 1]);
                result = a - b;
                i++;
            } else if (tokens[i].equals("*")) {
                int a = result;
                int b = Integer.parseInt(tokens[i + 1]);
                result = a * b;
                i++;
            } else {
                result = Integer.parseInt(tokens[i]);
            }
        }
        System.out.println(result);
    }
}
```
This code uses a `Scanner` to read the input from the user, and then splits the input into tokens using the `split` method. It then iterates through the tokens and performs the appropriate operation based on the token. Finally, it prints the result to the console.

Note that this code assumes that the input will be in the format of a space-separated list of numbers and operators, and that the operators will be in the correct order (i.e. no parentheses or other grouping symbols). If the input is not in this format, the code may not work correctly.</s>
