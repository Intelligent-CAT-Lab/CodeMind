Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(Arrays.stream(S.substring(0, N).toCharArray()).filter(c -> c == '(').count() - Arrays.stream(S.substring(0, N).toCharArray()).filter(c -> c == ')').count());
        int Q = Math.abs(Arrays.stream(S.substring(N+1).toCharArray()).filter(c -> c == '(').count() - Arrays.stream(S.substring(N+1).toCharArray()).filter(c -> c == ')').count());
        System.out.println(Math.min(P, Q));
    }
}
```<|endoftext|>
