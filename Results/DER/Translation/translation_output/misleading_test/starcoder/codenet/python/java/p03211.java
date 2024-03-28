<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
-27

```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int a=99999;
        for(int i=0;i<S.length()-2;i++){
            a=Math.min(Math.abs(753-Integer.parseInt(S.substring(i,i+3))),a);
        }
        System.out.println(a);
    }
}
```
'''
<|endoftext|>
