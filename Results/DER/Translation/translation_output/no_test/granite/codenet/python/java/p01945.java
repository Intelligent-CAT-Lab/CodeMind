System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.indexOf('*');
        int p = Math.abs(count(s.substring(0, n), '(') - count(s.substring(0, n), ')'));
        int q = Math.abs(count(s.substring(n + 1), '(') - count(s.substring(n + 1), ')'));
        System.out.println(Math.min(p, q));
    }

    public static int count(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}
```<|endoftext|>
