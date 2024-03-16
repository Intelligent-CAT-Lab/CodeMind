<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03005{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}

```

### 解题思路

```python
import java.util

class p03005:
    def main(self, args):
        ans = 0
        sc = java.util.Scanner(System.in)
        n = sc.nextInt()
        k = sc.nextInt()

        if k == 1:
            ans = 0
        else:
            ans = n - k

        print(ans)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03004](https://leetcode-cn.com/problems/p03004/)
</s>
