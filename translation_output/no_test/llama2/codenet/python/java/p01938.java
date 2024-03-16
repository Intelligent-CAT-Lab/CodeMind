<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Input

```
ABC
```

### Output

```
2
```

### Explanation

```
S = "ABC"

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

### Code

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (char s : S.toCharArray()) {
            int Next = alpha.indexOf(s);
            // print(s, Now, Next)

            if (Now < Next) {
                pass;
            } else {
                ans += 1;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}
```
</s>
