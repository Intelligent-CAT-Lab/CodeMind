<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        boolean b=S.replace("A","")=="KIHBR";
        if(b){
            List<Integer> L=Arrays.asList(S.split("A")).stream().map(s->s.length()).collect(Collectors.toList());
            List<Integer> X=Arrays.asList(1,0,0,1,1,1,1);
            b&=L.stream().map(l->l<=X.get(l)).reduce(true,(a,b)->a&b);
        }
        System.out.println("YNEOS"[b?0:1]);
    }
}
```
'''
<|endoftext|>
