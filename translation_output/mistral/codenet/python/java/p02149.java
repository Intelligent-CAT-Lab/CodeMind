<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] S = input.split(" ");
        int max = Integer.parseInt(S[0]);
        for (int i = 1; i < S.length; i++) {
            if (Integer.parseInt(S[i]) > max) {
                max = Integer.parseInt(S[i]);
            }
        }
        if (S.indexOf(max) == 0) {
            System.out.println("A");
        } else if (S.indexOf(max) == 1) {
            System.out.println("B");
        } else if (S.indexOf(max) == 2) {
            System.out.println("C");
        }
    }
}
```</s>
