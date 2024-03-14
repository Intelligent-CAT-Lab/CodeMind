<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=0;
        int q,r;
        q=x/11;
        r=x%11;
        ans+=2*q;
        q=r/6;
        ans+=q;
        if(r>0)
            ans+=1;
        System.out.println(ans);
    }
}
```
<|endoftext|>
