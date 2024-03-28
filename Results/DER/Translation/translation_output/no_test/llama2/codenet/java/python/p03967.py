<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;

public class p03967 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String top = r.readLine();
		boolean cpp = false;
		int score = 0;
		for (int j = 0; j < top.length(); j++) {
			if (cpp) {
				if (top.charAt(j) == 'g')
					score++;
				cpp = false;
			}
			else {
				if (top.charAt(j) == 'p')
					score--;
				cpp = true;
			}
		}
		System.out.println(score);
	}

}
```

### 解答

```python
import sys

top = sys.stdin.readline()
cpp = False
score = 0
for i in range(len(top)):
    if cpp:
        if top[i] == 'g':
            score += 1
        cpp = False
    else:
        if top[i] == 'p':
            score -= 1
        cpp = True

print(score)
```

### 解析

1. 读取输入
2. 初始化变量
3. 循环读取输入
4. 判断是否为cpp
5. 判断是否为g
6. 判断是否为p
7. 更新score
8. 输出结果

### 思路

1. 读取输入
2. 初始化变量
3. 循环读取输入
4. 判断是否为cpp
5. 判断是否为g
6. 判断是否为p
7. 更新score
8. 输出结果

### 代码

```python
import sys

top = sys.stdin.readline()
cpp = False
score = 0
for i in range(len(top)):
    if cpp:
        if top[i] == 'g':
            score += 1
        cpp = False
    else:
        if top[i] == 'p':
            score -= 1
        cpp = True

print(score)
```

### 复杂度分析

- 时间复杂度：O(n)
- 空间复杂度：O(1)

### 相关题目

- [p03966](./p03966.md)
</s>
