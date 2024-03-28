<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
2


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
        String s = sc.nextLine();
        int n = s.indexOf('*');
        int p = Math.abs(s.substring(0, n).replaceAll("\\(", "").replaceAll(")", "").length() - s.substring(0, n).replaceAll(")", "").length());
        int q = Math.abs(s.substring(n + 1, s.length()).replaceAll("\\(", "").replaceAll(")", "").length() - s.substring(n + 1, s.length()).replaceAll(")", "").length());
        System.out.println(Math.min(p, q));
    }
}
```</s>
