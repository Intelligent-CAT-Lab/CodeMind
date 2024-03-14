<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
        String s=sc.next();
        int a=99999;
        for(int i=0;i<s.length()-2;i++){
            a=Math.min(Math.abs(753-Integer.parseInt(s.substring(i,i+3))),a);
        }
        System.out.println(a);
    }
}
```
<|endoftext|>
