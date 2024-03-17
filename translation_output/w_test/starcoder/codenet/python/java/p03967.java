<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
0


```
s=input()
ret=0
for i in range(len(s)):
    ret+=(i%2)-[0,1][int(s[i]=="p")]
print(ret)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ret=0;
        for(int i=0;i<s.length();i++){
            ret+=(i%2)-[0,1][s.charAt(i)=='p'];
        }
        System.out.println(ret);
    }
}
```
'''
<|endoftext|>
