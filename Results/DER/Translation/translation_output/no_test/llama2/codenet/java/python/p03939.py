<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03939 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double d1 = sc.nextInt();
		double x = sc.nextInt();
		
		double ans = 0;
		
		for(; N>0; N--) {
			ans += d1 + (N-0.5)*x;
			d1 = ((2*N+2)*d1 + 5*x)/(2*N);
			x = ((double)N+2)/N*x;
		}
		
		System.out.println(ans);
		sc.close();
	}
}

```

### 解题思路

```python
import java.util

def main():
    N = int(input())
    d1 = int(input())
    x = int(input())
    ans = 0
    for i in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x
    print(ans)

if __name__ == '__main__':
    main()
```

### 复杂度分析

* 时间复杂度：O(N)。
* 空间复杂度：O(1)。

### 相关题目

1. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
2. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
3. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
4. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
5. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
6. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
7. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
8. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
9. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
10. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
11. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
12. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
13. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
14. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
15. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
16. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
17. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
18. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
19. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
20. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
21. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
22. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
23. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
24. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
25. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
26. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
27. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
28. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
29. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
30. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
31. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
32. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
33. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
34. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
35. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
36. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
37. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
38. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
39. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
40. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
41. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a-root/)
42. [牛顿法求解](https://leetcode-cn.com/problems/newtons-method-for-a
