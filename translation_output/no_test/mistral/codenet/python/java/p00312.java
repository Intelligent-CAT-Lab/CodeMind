<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int ans = (D / L) + (D - L * (D / L));
        System.out.println(ans);
    }
}
```</s>
