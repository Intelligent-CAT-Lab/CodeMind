<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```

### Input

```
KIHBR
```

### Output

```
YNEOS
```

### Explanation

```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String S = "KIHBR";
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            L.add(1);
            L.add(0);
            L.add(0);
            L.add(1);
            L.add(1);
            L.add(1);
            b &= all(L.get(i) <= 1 for i in range(L.size()));
        }
        System.out.println("YNEOS"[!b::2]);
    }
}
```
</s>
