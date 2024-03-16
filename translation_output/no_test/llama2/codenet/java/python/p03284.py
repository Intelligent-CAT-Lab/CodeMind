<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```

### 解题思路

```python
import java.util

def main():
    n = int(input())
    k = int(input())
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03283](https://leetcode-cn.com/problems/p03283/)
</s>
