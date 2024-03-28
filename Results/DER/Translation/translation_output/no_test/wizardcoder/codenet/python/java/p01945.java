Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(countChar(S.substring(0, N), '(') - countChar(S.substring(0, N), ')'));
        int Q = Math.abs(countChar(S.substring(N + 1), '(') - countChar(S.substring(N + 1), ')'));
        System.out.println(Math.min(P, Q));
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
```<|endoftext|>
