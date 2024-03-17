<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
S = input()
ans = 0
for i in range(len(S)-1):
    if S[i]!= S[i+1]:
        ans += 1
print(ans)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for (int i = 0; i < S.length()-1; i++) {
            if (S.charAt(i)!= S.charAt(i+1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
