<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()

alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Now = 0
ans = 0
for s in S:
    Next = alpha.find(s)
    # print(s, Now, Next)

    if(Now < Next):
        pass
    else:
        ans += 1
    Now = Next
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
        for(int i = 0; i < S.length(); i++) {
            int now = S.charAt(i) - 'A';
            int next = S.charAt(i+1) - 'A';
            if(now < next) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
