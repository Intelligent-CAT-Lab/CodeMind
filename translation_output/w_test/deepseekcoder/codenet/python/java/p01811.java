<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
Yes


```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.next();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        StringBuilder log = new StringBuilder();
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log.append('A');
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "C");
                log.append('C');
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log.append('B');
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }
        int l = log.length();
        for (int i = 0; i < l; i++) {
            s = s.replace(String.valueOf(log.charAt(l - 1 - i)), "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then it checks if the string can be transformed into "ABC" by replacing substrings "ABC" with "A", "B", or "C". If the string can be transformed, it prints "Yes", otherwise it prints "No".
<|EOT|>
