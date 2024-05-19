System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        char b ='';
        char r ='';
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += s.charAt(i) == 'c'? 3 : 7;
            c += 1;
        }
        if (c > p) {
            r = b;
        }
        System.out.println(r == 'e'? "egg" : "chicken");
    }
}
```

This Java code performs the same logic as the given Python code. It reads a string from the user, iterates over each character, and keeps track of the longest consecutive sequence of the same character. If the longest sequence is an "e", it prints "egg", otherwise it prints "chicken".<|endoftext|>
