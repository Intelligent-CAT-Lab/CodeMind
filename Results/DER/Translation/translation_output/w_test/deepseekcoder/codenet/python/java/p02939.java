<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aabbaa

Expected output:
4


```
S = input()

l = [0] * (len(S) + 1)
l[1] = 1
if S[0] == S[1]:
    l[2] = 1
else:
    l[2] = 2

for i in range(3, len(S)+1):
    if S[i-1] != S[i-2]:
        l[i] = l[i-1] + 1
    else:
        l[i] = l[i-3] + 2

print(l[-1])

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int[] l = new int[S.length() + 1];
        l[1] = 1;
        if (S.charAt(0) == S.charAt(1)) {
            l[2] = 1;
        } else {
            l[2] = 2;
        }

        for (int i = 3; i <= S.length(); i++) {
            if (S.charAt(i - 1) != S.charAt(i - 2)) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = l[i - 3] + 2;
            }
        }

        System.out.println(l[S.length()]);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, initializes an array with the same length as the string plus one, and then fills the array with the appropriate values. Finally, it prints the last value in the array.
<|EOT|>
