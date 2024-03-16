<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
i=c=p=0;b=''
while i<len(s):
    if s[i]==b:
        if c > p:r=b;p=c
        c=0
    b=s[i]
    i+=[3,7][s[i]=='c']
    c+=1
if c>p:r=b
print(['chicken','egg'][r=='e'])
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        char r = ' ';
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 3 : 7;
            c += 1;
        }
        if (c > p) {
            r = b;
        }
        System.out.println((r == 'e') ? "egg" : "chicken");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over the string. If it finds a sequence of the same character, it checks if the sequence is longer than the previous longest sequence. If it is, it updates the longest sequence and the character that caused it. Finally, it prints "egg" if the character that caused the longest sequence is 'e', and "chicken" otherwise.
<|EOT|>
