Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from functools import lru_cache  # ãã¾ããªã

l,k=map(int,input().split())

@lru_cache()     # python ç´ æ´ããã
def rec(i,isBlack):
    if i < 0: return 0
    if i == 0: return 1 if not isBlack else 0  # black at bottom
    if isBlack: # top is black
        return rec(i-1, False) + rec(i-k, False)
    else:  # top is white
        return rec(i-1, True)

ans = sum ( rec(i,True) for i in range(1, l+1))
    
print(ans)


```

### Response:
```java
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        IntBinaryOperator rec = new IntBinaryOperator() {
            private Map<Integer, Integer> cache = new HashMap<>();

            @Override
            public int applyAsInt(int i, int isBlack) {
                if (i < 0) return 0;
                if (i == 0) return 1 - isBlack;  // black at bottom
                if (isBlack == 1) { // top is black
                    if (cache.containsKey(i)) return cache.get(i);
                    int res = applyAsInt(i - 1, 0) + applyAsInt(i - k, 0);
                    cache.put(i, res);
                    return res;
                } else {  // top is white
                    if (cache.containsKey(i)) return cache.get(i);
                    int res = applyAsInt(i - 1, 1) + applyAsInt(i - k, 1);
                    cache.put(i, res);
                    return res;
                }
            }
        };

        int ans = IntStream.rangeClosed(1, l).map(i -> rec.applyAsInt(i, 1)).sum();

        System.out.println(ans);
    }
}
```<|endoftext|>
