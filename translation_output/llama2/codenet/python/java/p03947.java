<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
ans = 0
for i in range(len(S)-1):
    if S[i] != S[i+1]:
        ans += 1
print(ans)

```

### Input

```
abc
```

### Output

```
1
```

### Explanation

The first character is different from the second character.

### Code

```java
public class Solution {
    public int solution(String S) {
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                ans++;
            }
        }
        return ans;
    }
}
```
</s>
