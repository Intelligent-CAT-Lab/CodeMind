<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x = int(input())
ans = 1
for b in range(x):
    for p in range(2, x):
        if b**p <= x:
            ans = max(ans, b**p)
        else:
            break
print(ans)
```

### 解答

```java
public class Solution {
    public int solution(int x) {
        int ans = 1;
        for (int b = 1; b <= x; b++) {
            for (int p = 2; p <= x; p++) {
                if (b * b * ... * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b * b
