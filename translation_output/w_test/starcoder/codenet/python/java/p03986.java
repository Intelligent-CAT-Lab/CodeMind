<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
TSTTSS

Expected output:
4


```
X=input()
ans=0
memo=0
for i in range(len(X)):
    if X[i]=="T":
        if memo==0:pass
        else:memo-=1
    else:memo+=1
print(memo*2)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=0,memo=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='T'){
                if(memo==0)continue;
                else memo--;
            }
            else memo++;
        }
        System.out.println(memo*2);
    }
}
```
<|endoftext|>
