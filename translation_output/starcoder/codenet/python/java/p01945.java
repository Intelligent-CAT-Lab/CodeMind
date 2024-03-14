<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.indexOf('*');
        int p = Math.abs(s.substring(0, n).replaceAll("[()]", "").length());
        int q = Math.abs(s.substring(n + 1).replaceAll("[()]", "").length());
        System.out.println(Math.min(p, q));
    }
}
```
<|endoftext|>
