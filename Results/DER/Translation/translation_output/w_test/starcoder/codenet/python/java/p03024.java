<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxoxoxoxoxoxox

Expected output:
YES


```
x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='x')
                a++;
        }
        System.out.println(a<=7?"YES":"NO");
    }
}
```
'''
<|endoftext|>
