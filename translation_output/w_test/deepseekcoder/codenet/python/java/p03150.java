<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YES


```
S = input()
for i in range(len(S)):
    for j in range(i,len(S)+1):
        if S[:i]+S[j:] == "keyence":
            print("YES")
            exit()
for k in range(len(S)):
    if S[i::i+8] == "keyence":
        print("YES")
        exit()
print("NO")
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if ((S.substring(0, i) + S.substring(j)).equals("keyence")) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(k, S.length()).equals("keyence")) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then checks if any substring of the input string can be rearranged to form the string "keyence". If it can, it prints "YES", otherwise it prints "NO".
<|EOT|>
