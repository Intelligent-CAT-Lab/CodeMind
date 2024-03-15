<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p02987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Arrays.sort(s);
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

```

### 解题思路

```python
import java.util.Arrays;
import java.util.Scanner;

class p02987:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        s = sc.next().toCharArray()
        Arrays.sort(s)
        if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
            print("Yes")
        else:
            print("No")
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02986](https://leetcode-cn.com/problems/palindrome-partitioning-ii/)
</s>
