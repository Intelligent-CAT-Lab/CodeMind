<s> Translate the following python code to java and enclose your solution inside ```java```:
```
D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```

### Input

```
5
```

### Output

```
Christmas Eve Eve Eve Eve
```

### Explanation

```
D=5
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```

### Code

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        Map<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");
        System.out.println(d.get(D));
    }
}
```
</s>
