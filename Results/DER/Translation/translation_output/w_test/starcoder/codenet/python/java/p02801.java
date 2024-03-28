<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
b


```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        char[] al=new char[26];
        for(int i=0;i<26;i++)
            al[i]=(char)(i+97);
        System.out.print(al[al.length-1-al[c-'a']]);
    }
}
```
'''
<|endoftext|>
