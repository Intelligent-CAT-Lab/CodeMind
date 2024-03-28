<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
bH

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
        String s=sc.next();
        char[] al=new char[26];
        for(int i=0;i<26;i++)
        {
            al[i]=(char)(i+97);
        }
        int idx=Arrays.binarySearch(al,s.charAt(0));
        System.out.print(al[idx+1]);
    }
}
```
'''
<|endoftext|>
