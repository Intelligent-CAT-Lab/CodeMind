<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for (int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		boolean ans  = false;
		Arrays.sort(N);
		if (N[0] == 1 && N[1] ==4 && N[2]==7 && N[3]==9) {
			ans = true;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

```

### 解题思路

```python
import java.util.Arrays;
import java.util.Scanner;

class p03149:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        N = [int(sc.next()) for _ in range(4)]
        ans = False
        N.sort()
        if N[0] == 1 and N[1] == 4 and N[2] == 7 and N[3] == 9:
            ans = True
        if ans:
            print("YES")
        else:
            print("NO")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03148](https://leetcode-cn.com/problems/p03148/)
</s>
