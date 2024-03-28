<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            for (char c : S.toCharArray()) {
                if (c != 'A') {
                    L.add(1);
                } else {
                    L.add(0);
                }
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            boolean c = true;
            for (int i = 0; i < L.size(); i++) {
                c &= L.get(i) <= X[i];
            }
            System.out.println("spC".charAt(not b::2));
        }
    }
}
```</s>
