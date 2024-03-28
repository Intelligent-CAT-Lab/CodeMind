<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


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
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        if (S[0] == S[1] && S[1] == S[2]) {
            System.out.println("A");
        } else if (S[0] == S[1] || S[1] == S[2] || S[0] == S[2]) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
```
Sample test case:
```
1000 900 850
```
Expected output:
```
A
```</s>
