<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
C0DEFESTIVAL2O16

Expected output:
2


```
S = str(input())
A = 'CODEFESTIVAL2016'
cnt = 0
for i in range(len(A)):
    if A[i] != S[i]:
        cnt += 1
print(cnt)
```

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, compares it to the string `A`, and counts the number of characters that are different. The result is then printed out.
<|EOT|>
