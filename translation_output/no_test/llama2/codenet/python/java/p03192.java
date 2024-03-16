<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = raw_input()
print len([i for i in N if i == '2'])

```

### Solution

```java
public class Solution {
    public int solution(String N) {
        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }
        return count;
    }
}
```
</s>
