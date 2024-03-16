<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = 1000000007;
        System.out.println(Math.pow(m,n)%mod);
    }
}
```
<|endoftext|>
