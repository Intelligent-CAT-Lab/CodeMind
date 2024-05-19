System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, c = 0, p = 0;
        char b ='';
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
            i += (b == 'c')? 3 : 7;
            c += 1;
        }
        if (c > p) {
            r = String.valueOf(b);
        }
        System.out.println((r.equals("e"))? "egg" : "chicken");
    }
}
```

Test input:
eggchickenegg

Expected output:
egg<|endoftext|>
