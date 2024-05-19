System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] split = "".join("*" + (s.equals("A")? "" : s) for s : S.split("")).split("*");
            int[] L = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                L[i] = split[i].length();
            }
            int[] X = {1, 0, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                b &= L[i] <= X[i];
            }
        }
        System.out.println(b? "YES" : "NO");
    }
}
```<|endoftext|>
