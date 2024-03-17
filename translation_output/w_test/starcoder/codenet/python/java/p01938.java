<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
2


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
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i+1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
