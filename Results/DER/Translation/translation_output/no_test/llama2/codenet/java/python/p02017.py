<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```

### 解答

```python
import sys

h = int(sys.stdin.readline())
w = int(sys.stdin.readline())
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `int()` 将输入转换为整数
3. 使用 `if` 语句判断条件
4. 使用 `print` 打印结果

### 执行结果

```
10 10 1 1
No
```

### 相关题目

1. [2017 - 02 - 01](https://leetcode-cn.com/problems/2017-02-01/)  
2. [2017 - 02 - 02](https://leetcode-cn.com/problems/2017-02-02/)  
3. [2017 - 02 - 03](https://leetcode-cn.com/problems/2017-02-03/)  
4. [2017 - 02 - 04](https://leetcode-cn.com/problems/2017-02-04/)  
5. [2017 - 02 - 05](https://leetcode-cn.com/problems/2017-02-05/)  
6. [2017 - 02 - 06](https://leetcode-cn.com/problems/2017-02-06/)  
7. [2017 - 02 - 07](https://leetcode-cn.com/problems/2017-02-07/)  
8. [2017 - 02 - 08](https://leetcode-cn.com/problems/2017-02-08/)  
9. [2017 - 02 - 09](https://leetcode-cn.com/problems/2017-02-09/)  
10. [2017 - 02 - 10](https://leetcode-cn.com/problems/2017-02-10/)  
11. [2017 - 02 - 11](https://leetcode-cn.com/problems/2017-02-11/)  
12. [2017 - 02 - 12](https://leetcode-cn.com/problems/2017-02-12/)  
13. [2017 - 02 - 13](https://leetcode-cn.com/problems/2017-02-13/)  
14. [2017 - 02 - 14](https://leetcode-cn.com/problems/2017-02-14/)  
15. [2017 - 02 - 15](https://leetcode-cn.com/problems/2017-02-15/)  
16. [2017 - 02 - 16](https://leetcode-cn.com/problems/2017-02-16/)  
17. [2017 - 02 - 17](https://leetcode-cn.com/problems/2017-02-17/)  
18. [2017 - 02 - 18](https://leetcode-cn.com/problems/2017-02-18/)  
19. [2017 - 02 - 19](https://leetcode-cn.com/problems/2017-02-19/)  
20. [2017 - 02 - 20](https://leetcode-cn.com/problems/2017-02-20/)  
21. [2017 - 02 - 21](https://leetcode-cn.com/problems/2017-02-21/)  
22. [2017 - 02 - 22](https://leetcode-cn.com/problems/2017-02-22/)  
23. [2017 - 02 - 23](https://leetcode-cn.com/problems/2017-02-23/)  
24. [2017 - 02 - 24](https://leetcode-cn.com/problems/2017-02-24/)  
25. [2017 - 02 - 25](https://leetcode-cn.com/problems/2017-02-25/)  
26. [2017 - 02 - 26](https://leetcode-cn.com/problems/2017-02-26/)  
27. [2017 - 02 - 27](https://leetcode-cn.com/problems/2017-02-27/)  
28. [2017 - 02 - 28](https://leetcode-cn.com/problems/2017-02-28/)  
29. [2017 - 02 - 29](https://leetcode-cn.com/problems/2017-02-29/)  
30. [2017 - 02 - 30](https://leetcode-cn.com/problems/2017-02-30/)  
31. [2017 - 03 - 01](https://leetcode-cn.com/problems/2017-03-01/)  
32. [2017 - 03 - 02](https://leetcode-cn.com/problems/2017-03-02/)  
33. [2017 - 03 - 03](https://leetcode-cn.com/problems/2017-03-03/)  
34. [2017 - 03 - 04](https://leetcode-cn.com/problems/2017-03-04/)  
35. [2017 - 03 - 05](https://leetcode-cn.com/problems/2017-03-05/)  
36. [2017 - 03 - 06](https://leetcode-cn.com/problems/2017-03-06/)  
37. [2017 - 03 - 07](https://leetcode-cn.com/problems/2017-03-07/)  
38. [2017 - 03 - 08](https://leetcode-cn.com/problems/2017-03-08/)  
39. [2017
