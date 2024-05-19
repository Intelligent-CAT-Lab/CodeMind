System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
-85

```
S = input()
ans = 0
for i in range(len(S)-1):
    if S[i]!= S[i+1]:
        ans += 1
print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i)!= S.charAt(i + 1)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
```
BBBWW
```

Expected output:
```
-85
```<|endoftext|>
