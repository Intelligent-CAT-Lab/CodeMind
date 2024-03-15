<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < Math.pow(2, n); i++) {
			int temp = i;
			System.out.print(i + ":");
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) System.out.print(" " + j);
				temp /= 2;
			}
			System.out.println();
		}
	}
}

```

### 解答

```python
import sys

n = int(sys.stdin.readline())

for i in range(1, 2**n+1):
    temp = i
    print(i, end=':')
    for j in range(1, n+1):
        if temp % 2 == 1:
            print(j, end=' ')
        temp //= 2
    print()
```

### 解析

1. 使用 ```sys.stdin.readline()``` 读取输入，然后将其转换为 ```int``` 类型。
2. 使用 ```range()``` 函数，从 1 到 2**n 的整数范围内遍历。
3. 使用 ```temp = i``` 将 ```i``` 赋值给 ```temp```.
4. 使用 ```print(i, end=':')``` 打印 ```i``` 和一个冒号。
5. 使用 ```for j in range(1, n+1):``` 遍历 ```j``` 从 1 到 ```n+1``` 的整数范围内。
6. 使用 ```if temp % 2 == 1:``` 判断 ```temp``` 是否是奇数。
7. 使用 ```print(j, end=' ')``` 打印 ```j``` 和一个空格。
8. 使用 ```temp //= 2``` 将 ```temp``` 除以 2 得到一个整数。
9. 使用 ```print()``` 打印一个空行。

### 复杂度分析

- 时间复杂度：$$O(n)$$。
- 空间复杂度：$$O(n)$$。

### 相关题目

1. [翻转字符串](https://leetcode-cn.com/problems/reverse-string/)
2. [翻转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)
3. [翻转字符串 III](https://leetcode-cn.com/problems/reverse-string-iii/)
4. [翻转字符串 IV](https://leetcode-cn.com/problems/reverse-string-iv/)
5. [翻转字符串 V](https://leetcode-cn.com/problems/reverse-string-v/)
6. [翻转字符串 VI](https://leetcode-cn.com/problems/reverse-string-vi/)
7. [翻转字符串 VII](https://leetcode-cn.com/problems/reverse-string-vii/)
8. [翻转字符串 VIII](https://leetcode-cn.com/problems/reverse-string-viii/)
9. [翻转字符串 IX](https://leetcode-cn.com/problems/reverse-string-ix/)
10. [翻转字符串 X](https://leetcode-cn.com/problems/reverse-string-x/)
11. [翻转字符串 XI](https://leetcode-cn.com/problems/reverse-string-xi/)
12. [翻转字符串 XII](https://leetcode-cn.com/problems/reverse-string-xii/)
13. [翻转字符串 XIII](https://leetcode-cn.com/problems/reverse-string-xiii/)
14. [翻转字符串 XIV](https://leetcode-cn.com/problems/reverse-string-xiv/)
15. [翻转字符串 XV](https://leetcode-cn.com/problems/reverse-string-xv/)
16. [翻转字符串 XVI](https://leetcode-cn.com/problems/reverse-string-xvi/)
17. [翻转字符串 XVII](https://leetcode-cn.com/problems/reverse-string-xvii/)
18. [翻转字符串 XVIII](https://leetcode-cn.com/problems/reverse-string-xviii/)
19. [翻转字符串 XIX](https://leetcode-cn.com/problems/reverse-string-xix/)
20. [翻转字符串 XX](https://leetcode-cn.com/problems/reverse-string-xx/)
21. [翻转字符串 XXI](https://leetcode-cn.com/problems/reverse-string-xxi/)
22. [翻转字符串 XXII](https://leetcode-cn.com/problems/reverse-string-xxii/)
23. [翻转字符串 XXIII](https://leetcode-cn.com/problems/reverse-string-xxiii/)
24. [翻转字符串 XXIV](https://leetcode-cn.com/problems/reverse-string-xxiv/)
25. [翻转字符串 XXV](https://leetcode-cn.com/problems/reverse-string-xxv/)
26. [翻转字符串 XXVI](https://leetcode-cn.com/problems/reverse-string-xxvi/)
27. [翻转字符串 XXVII](https://leetcode-cn.com/problems/reverse-string-xxvii/)
28. [翻转字符串 XXVIII](https://leetcode-cn.com/problems/reverse-string-xxviii/)
29. [翻转字符串 XXIX](https://leetcode-cn.com/problems/reverse-string-xxix/)
30. [翻转字符串 XXX](https://leetcode-cn.com/problems/reverse-string-xxx/)
31. [翻转字符串 XXXI](https://leetcode-cn.com/problems/reverse-string-xxxI/)
32. [翻转字符串 XXXII](https://leetcode-cn.com/problems/reverse-string-xxxII/)
33. [翻转字符串 XXXIII](https://leetcode-cn.com/problems/reverse-string-xxxIII/)
34. [翻转字符串 XXXIV](https://leetcode-cn.com/problems/reverse-string-xxxIV/)
35. [翻转字符串 XXXV](https://leetcode-cn.com/problems/reverse-string-xxxV/)
36. [翻转字符串 XXXVI](https://leetcode-cn.com/problems/reverse-string-xxxVI/)
37. [翻转字符串 XXXVII](https://leetcode-cn.com/problems/reverse-string-xxxVII/)
38. [翻转字符串 XXXVIII](https://leetcode-cn.com/problems/reverse-string-xxxVIII/)
39. [翻转字符串 XXXIX](https://leetcode-cn.com/problems/reverse-string-xxxIX/)
40. [翻转字符串 XL](https://leetcode-cn.com
