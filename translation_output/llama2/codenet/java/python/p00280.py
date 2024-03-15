<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.IOException;
import java.util.Scanner;

public class p00280 {

	public static void main(String[] args) throws IOException {

		new p00280().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		slove(0, 0, "");
	}

	private void slove(int x, int y, String s) {
		if ((x == 5 && y < b && y != 4) || y == 5 && x < a && x != 4)
			return;
		if (x == a + 1 || y == b + 1)
			return;
		if (x == a && y == b)
			System.out.println(s);
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				slove(x + 1, y, s + "A");
			} else
				slove(x, y + 1, s + "B");
		}
	}

	int a, b;
}
```

### 解题思路

```python
import sys

a, b = map(int, sys.stdin.readline().split())

def solve(x, y, s):
    if (x == 5 and y < b and y != 4) or y == 5 and x < a and x != 4:
        return
    if x == a + 1 or y == b + 1:
        return
    if x == a and y == b:
        print(s)
    for i in range(2):
        if i == 0:
            solve(x + 1, y, s + "A")
        else:
            solve(x, y + 1, s + "B")

solve(0, 0, "")
```

### 复杂度分析

- 时间复杂度：O(2^n)。
- 空间复杂度：O(1)。

### 相关题目

1. [矩形](https://leetcode-cn.com/problems/rectangle-area/)
2. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci/)
3. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution/)
4. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-2/)
5. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-3/)
6. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-4/)
7. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-5/)
8. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-6/)
9. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-7/)
10. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-8/)
11. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-9/)
12. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-10/)
13. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-11/)
14. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-12/)
15. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-13/)
16. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-14/)
17. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-15/)
18. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-16/)
19. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-17/)
20. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-18/)
21. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-19/)
22. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-20/)
23. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-21/)
24. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-22/)
25. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-23/)
26. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-24/)
27. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-25/)
28. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-26/)
29. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-27/)
30. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-28/)
31. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-29/)
32. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-30/)
33. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-31/)
34. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-32/)
35. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-33/)
36. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-34/)
37. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-35/)
38. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-36/)
39. [矩形](https://leetcode-cn.com/problems/rectangle-area-lcci-solution-37/)
40. [
