<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
99

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
        String input = sc.nextLine();
        String S = input;
        int N = S.indexOf('*');
        int P = Math.abs(S.substring(0, N).replaceAll("\\(", "").replaceAll(")", "").length() - S.substring(0, N).replaceAll(")", "").length());
        int Q = Math.abs(S.substring(N + 1, S.length()).replaceAll("\\(", "").replaceAll(")", "").length() - S.substring(N + 1, S.length()).replaceAll(")", "").length());
        System.out.println(Math.min(P, Q));
    }
}
```</s>
