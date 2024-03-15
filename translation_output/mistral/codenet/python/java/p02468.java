<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        long mod = 1000000007;
        long result = Math.pow(m, n, mod);
        System.out.println(result);
    }
}
```</s>
