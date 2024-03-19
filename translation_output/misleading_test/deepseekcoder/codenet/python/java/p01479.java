<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
eggchickenegg

Expected output:
egg

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
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        String r = "";
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = String.valueOf(b);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 3 : 7;
            c += 1;
        }
        if (c > p) {
            r = String.valueOf(b);
        }
        System.out.println((r.equals("e")) ? "egg" : "chicken");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over the string. If it finds a sequence of the same character, it counts the length of this sequence. If the length of the sequence is greater than the previous maximum, it updates the maximum length and the character that produced this maximum length. Finally, it prints "egg" if the character that produced the maximum length is 'e', and "chicken" otherwise.
<|EOT|>
