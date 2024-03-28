<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, c = 0, p = 0;
        String b = "";
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    b = s.charAt(i);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 3 : 7;
            c++;
        }
        if (c > p) {
            b = s.charAt(i);
        }
        System.out.println(Arrays.asList("chicken", "egg")[(b == 'e')]);
    }
}
```</s>
