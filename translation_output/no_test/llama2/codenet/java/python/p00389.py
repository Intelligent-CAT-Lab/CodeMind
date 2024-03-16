<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong(), K = sc.nextLong();
        long next;
        int ans = 1;
        while (base >= 1) {
            long low = 0, high = base;
            while (high - low > 1) {
                long willNext = (low + high) / 2;
                if(willNext <= K*(base - willNext)) {//OK
                    low = willNext;
                } else {
                    high = willNext;
                }
            }
            next = low;

            if (next > 0) {
                base = next;
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}


```

### 解题思路

1. 使用快排法，将base的值划分为两个区间，依次找到base的最小值，然后将base的值设为最小值，并且将ans++
2. 如果base的值小于等于0，则直接break

### 代码实现

```python
import sys

def main():
    base = int(sys.stdin.readline())
    K = int(sys.stdin.readline())
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            willNext = (low + high) / 2
            if willNext <= K * (base - willNext):
                low = willNext
            else:
                high = willNext
        next = low
        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(log(base))
- 空间复杂度：O(1)
</s>
