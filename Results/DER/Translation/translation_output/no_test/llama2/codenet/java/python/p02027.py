<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02027 {
    static HashMap<Integer, HashMap<Integer, Long>> dp = new HashMap<>();
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long total = 0;
        for (int i = 1; i * Math.pow(2, k - 1) <= n; i++) {
            total += search(i, k - 1, n);
        } 
        System.out.println(total);
    }
    
    static long search(int num, int count, int max) {
        if (count == 0) {
            return 1;
        }
        if (dp.containsKey(num)) {
            if (dp.get(num).containsKey(count)) {
                return dp.get(num).get(count);
            }
        }
        long total = 0;
        for (int i = 2; num * i * Math.pow(2, count - 1) <= max; i++) {
            total += search(num * i, count - 1, max);
        }
        if (dp.containsKey(num)) {
            dp.get(num).put(count, total);
        } else {
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(count, total);
            dp.put(num, map);
        }
        return total;
    }
}

```

### 解题思路

```python
import java.util

class Solution:
    def numOfSubsets(self, nums: List[int], k: int) -> int:
        if k == 0:
            return 1
        if k == 1:
            return len(nums)
        if k == 2:
            return len(nums) * (len(nums) - 1) // 2
        if k == 3:
            return len(nums) * (len(nums) - 1) // 3
        if k == 4:
            return len(nums) * (len(nums) - 1) // 4
        if k == 5:
            return len(nums) * (len(nums) - 1) // 5
        if k == 6:
            return len(nums) * (len(nums) - 1) // 6
        if k == 7:
            return len(nums) * (len(nums) - 1) // 7
        if k == 8:
            return len(nums) * (len(nums) - 1) // 8
        if k == 9:
            return len(nums) * (len(nums) - 1) // 9
        if k == 10:
            return len(nums) * (len(nums) - 1) // 10
        if k == 11:
            return len(nums) * (len(nums) - 1) // 11
        if k == 12:
            return len(nums) * (len(nums) - 1) // 12
        if k == 13:
            return len(nums) * (len(nums) - 1) // 13
        if k == 14:
            return len(nums) * (len(nums) - 1) // 14
        if k == 15:
            return len(nums) * (len(nums) - 1) // 15
        if k == 16:
            return len(nums) * (len(nums) - 1) // 16
        if k == 17:
            return len(nums) * (len(nums) - 1) // 17
        if k == 18:
            return len(nums) * (len(nums) - 1) // 18
        if k == 19:
            return len(nums) * (len(nums) - 1) // 19
        if k == 20:
            return len(nums) * (len(nums) - 1) // 20
        if k == 21:
            return len(nums) * (len(nums) - 1) // 21
        if k == 22:
            return len(nums) * (len(nums) - 1) // 22
        if k == 23:
            return len(nums) * (len(nums) - 1) // 23
        if k == 24:
            return len(nums) * (len(nums) - 1) // 24
        if k == 25:
            return len(nums) * (len(nums) - 1) // 25
        if k == 26:
            return len(nums) * (len(nums) - 1) // 26
        if k == 27:
            return len(nums) * (len(nums) - 1) // 27
        if k == 28:
            return len(nums) * (len(nums) - 1) // 28
        if k == 29:
            return len(nums) * (len(nums) - 1) // 29
        if k == 30:
            return len(nums) * (len(nums) - 1) // 30
        if k == 31:
            return len(nums) * (len(nums) - 1) // 31
        if k == 32:
            return len(nums) * (len(nums) - 1) // 32
        if k == 33:
            return len(nums) * (len(nums) - 1) // 33
        if k == 34:
            return len(nums) * (len(nums) - 1) // 34
        if k == 35:
            return len(nums) * (len(nums) - 1) // 35
        if k == 36:
            return len(nums) * (len(nums) - 1) // 36
        if k == 37:
            return len(nums) * (len(nums) - 1) // 37
        if k == 38:
            return len(nums) * (len(nums) - 1) // 38
        if k == 39:
            return len(nums) * (len(nums) - 1) // 39
        if k == 40:
            return len(nums) * (len(nums) - 1) // 40
        if k == 41:
            return len(nums) * (len(nums) - 1) // 41
        if k == 42:
            return len(nums) * (len(nums) - 1) // 42
        if k == 43:
            return len(nums) * (len(nums) - 1) // 43
        if k == 44:
            return len(nums) * (len(nums) - 1) // 44
        if k == 45:
            return len(nums) * (len(nums) - 1) // 45
        if k == 46:
            return len(nums) * (len(nums) - 1) // 46
        if k == 47:
            return len(nums) * (len(nums) - 1) // 47
        if k == 48:
            return len(nums) * (len(nums) - 1) // 48
        if k == 49:
            return len(nums) * (len(nums) - 1) // 49
        if k == 50:
            return len(nums) * (len(nums) - 1) // 50
        if k == 51:
            return len(nums) * (len(nums)
