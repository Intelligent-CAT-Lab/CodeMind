<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int ans = (int) Math.ceil((double)D/L);
        System.out.println(ans);
    }
}
```
<|endoftext|>
