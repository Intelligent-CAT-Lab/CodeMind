<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03835{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                int z = s - x - y;
                if(z >= 0 && z <= k){
                    count++;
                }
            }
        }


        // answer
        System.out.println(count);

    }
}
```

### 解题思路

```python
import sys

k = int(sys.stdin.readline())
s = int(sys.stdin.readline())

count = 0
for x in range(0, k+1):
    for y in range(0, k+1):
        z = s - x - y
        if z >= 0 and z <= k:
            count += 1

print(count)
```

### 复杂度分析

- 时间复杂度：O(k^2)。
- 空间复杂度：O(1)。

### 相关题目

- [p03834](https://leetcode-cn.com/problems/number-of-ways-to-make-a-sum-of-k/)
</s>
