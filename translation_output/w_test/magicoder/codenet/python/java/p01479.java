<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    p = c;
                    c = 0;
                }
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 7 : 3;
            c++;
        }
        if (c > p) {
            p = c;
        }
        System.out.println((b == 'e') ? "egg" : "chicken");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates through the string, counting the number of consecutive occurrences of each character. If the character is 'c', it increments the index by 7, otherwise it increments it by 3. If the count of the current character is greater than the previous maximum count, it updates the maximum count and resets the count for the current character. Finally, it prints "egg" if the last character was 'e', otherwise it prints "chicken".<｜end▁of▁sentence｜>
