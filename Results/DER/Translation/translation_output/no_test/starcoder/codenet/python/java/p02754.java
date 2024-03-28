<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = n/(a+b);
        int p = n%(a+b);
        System.out.println(k*a + Math.min(p,a));
    }
}
```
<|endoftext|>
