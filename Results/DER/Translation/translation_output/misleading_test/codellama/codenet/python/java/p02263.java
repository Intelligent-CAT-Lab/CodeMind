<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 +

Expected output:
-28

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
                int b = result;
                result = b + a;
            } else if (tokens[i].equals("-")) {
                int a = result;
                int b = result;
                result = b - a;
            } else if (tokens[i].equals("*")) {
                int a = result;
                int b = result;
                result = b * a;
            } else {
                result = Integer.parseInt(tokens[i]);
            }
        }
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input string into tokens. It then iterates through the tokens and performs the appropriate operation based on the token. Finally, it prints the result.

Note that this code assumes that the input will be a valid expression, and that the expression will only contain the operators `+`, `-`, and `*`. If the input is not valid, the code may throw a `NumberFormatException` or `ArrayIndexOutOfBoundsException`.</s>
