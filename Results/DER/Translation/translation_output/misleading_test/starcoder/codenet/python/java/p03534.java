<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abac

Expected output:
YEFS

```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') a++;
            if(s.charAt(i)=='b') b++;
            if(s.charAt(i)=='c') c++;
        }
        if(Math.max(Math.abs(a-b),Math.abs(b-c),Math.abs(c-a))<=1) System.out.println("YES");
        else System.out.println("NO");
    }
}
```
'''
<|endoftext|>
