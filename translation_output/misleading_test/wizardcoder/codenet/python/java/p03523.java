Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
spC

```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        boolean b=S.replace("A","")=="KIHBR";
        if(b){
            List<Integer> L=Arrays.asList(S.replaceAll("[^A]","*").split("\\*")).stream().map(String::length).collect(Collectors.toList());
            List<Integer> X=Arrays.asList(1,0,0,1,1,1,1);
            b&=L.stream().allMatch(i->i<=X.get(L.indexOf(i)));
        }
        System.out.println("YNEOS"[b?0:1]);
    }
}
```<|endoftext|>
