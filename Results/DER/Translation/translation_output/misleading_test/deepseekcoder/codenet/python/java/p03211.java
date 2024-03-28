<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
-27

```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            a = Math.min(Math.abs(753 - Integer.parseInt(S.substring(i, i + 3))), a);
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads a string of digits from the input, then iterates over the string, taking three-digit substrings and calculating the absolute difference from 753. It keeps track of the smallest difference found so far, and prints that value at the end.
<|EOT|>
