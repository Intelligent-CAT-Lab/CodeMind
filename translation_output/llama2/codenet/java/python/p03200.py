<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```

### 解答

```python
import sys

def main():
    s = sys.stdin.readline()
    black = 0
    count = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == '__main__':
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `for` 循环遍历字符串
3. 使用 `if` 语句判断字符串中的字符
4. 使用 `print` 打印结果

### 总结

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `for` 循环遍历字符串
3. 使用 `if` 语句判断字符串中的字符
4. 使用 `print` 打印结果

### 参考

1. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
2. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
3. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
4. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
5. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
6. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
7. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
8. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
9. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
10. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
11. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
12. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
13. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
14. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
15. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
16. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
17. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
18. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
19. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
20. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
21. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
22. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
23. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
24. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
25. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
26. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
27. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
28. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
29. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
30. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
31. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
32. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
33. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
34. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/1017959784159400)
35. [Python 3 入门教程](https://www.liaoxuefeng.com/wiki/10179
