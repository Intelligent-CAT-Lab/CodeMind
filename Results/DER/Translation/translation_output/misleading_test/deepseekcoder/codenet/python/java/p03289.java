<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
ACO

```
S = input()

flag = 0
if S[0] != "A":
    flag = 1
    
count = 0
for i in range(2,len(S)-1):
    if S[i] == "C":
        count += 1
if count != 1:
    flag = 1

count2 = 0
for i in S:
    if i == i.upper():
        count2 += 1
if count2 != 2:
    flag = 1
    
if flag == 0:
    print("AC")
else:
    print("WA")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int flag = 0;
        if (S.charAt(0) != 'A') {
            flag = 1;
        }

        int count = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count += 1;
            }
        }
        if (count != 1) {
            flag = 1;
        }

        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                count2 += 1;
            }
        }
        if (count2 != 2) {
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string `S` from the input, checks if the string meets the conditions specified in the Python code, and prints "AC" if the string meets the conditions and "WA" otherwise.
<|EOT|>
