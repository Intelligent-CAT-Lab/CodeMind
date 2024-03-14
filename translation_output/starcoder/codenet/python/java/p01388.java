<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=0,u=0,p=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='K')
                k++;
            if(s.charAt(i)=='U')
                u++;
            if(s.charAt(i)=='P')
                p++;
            if(s.charAt(i)=='C')
                c++;
        }
        System.out.println(Math.min(k,Math.min(u,Math.min(p,c))));
    }
}
```
<|endoftext|>
