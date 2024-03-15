<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

### Input

```
KUCP
```

### Output

```
2
```

### Explanation

```
K=1
U=1
P=1
C=1
min(K,U,P,C)=2
```

### Solution

```java
public class Solution {
    public int min(String a) {
        int K=a.count('K');
        int U=a.count('U');
        int P=a.count('P');
        int C=a.count('C');
        return Math.min(K,U,P,C);
    }
}
```
</s>
