<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for(int i=0;i<3;i++) S[i] = sc.nextInt();
        if(S.indexOf(Math.max(S)) == 0) System.out.println("A");
        else if(S.indexOf(Math.max(S)) == 1) System.out.println("B");
        else if(S.indexOf(Math.max(S)) == 2) System.out.println("C");
    }
}
```
<|endoftext|>
