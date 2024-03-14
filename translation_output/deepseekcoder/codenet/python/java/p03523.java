<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            StringBuilder sb = new StringBuilder();
            for (char c : S.toCharArray()) {
                sb.append(c != 'A' ? c : "*");
            }
            String[] parts = sb.toString().split("\\*");
            int[] L = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                L[i] = parts[i].length();
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i] > X[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, checks if it meets certain conditions, and prints "YES" or "NO" accordingly.
<|EOT|>
