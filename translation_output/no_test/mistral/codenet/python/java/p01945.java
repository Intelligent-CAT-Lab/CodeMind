<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(S.substring(0, N).count("(") - S.substring(0, N).count(")"));
        int Q = Math.abs(S.substring(N + 1, S.length()).count("(") - S.substring(N + 1, S.length()).count(")"));
        System.out.println(Math.min(P, Q));
    }
}
```</s>
