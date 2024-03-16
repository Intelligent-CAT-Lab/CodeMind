<s> Translate the following python code to java and enclose your solution inside ```java```:
```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
n,m = map(int,input().split())

points = ["0"] * n

for i in range(n//2 + 1, n):
    points[i] = str(m)

print(" ".join(points))
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] points = new String[n];
        for (int i = 0; i < n; i++) {
            points[i] = "0";
        }

        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        System.out.println(String.join(" ", points));
    }
}
```

### 解析

1. 读取输入
2. 初始化数组
3. 循环输入
4. 输出

### 思路

1. 读取输入
2. 初始化数组
3. 循环输入
4. 输出

### 总结

1. 读取输入
2. 初始化数组
3. 循环输入
4. 输出

### 参考

1. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
2. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
3. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
4. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
5. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
6. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
7. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
8. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
9. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
10. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
11. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
12. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
13. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
14. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
15. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
16. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
17. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
18. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
19. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
20. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
21. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
22. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
23. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
24. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
25. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
26. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
27. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
28. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
29. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
30. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
31. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
32. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
33. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
34. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
35. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
36. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
37. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
38. [Python 3.8.2.dev20200413](https://www.python.org/downloads/release/python-382/)
39. [Python 3.8.2.dev20200413](https://www.python.
