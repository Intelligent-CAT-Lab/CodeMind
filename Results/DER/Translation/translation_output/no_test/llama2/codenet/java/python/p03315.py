<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}


```

### 解题思路

```python
import sys


def main():
    s = sys.stdin.readline()
    ary = s.strip().split('')
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)


if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03314](https://leetcode-cn.com/problems/p03314/)
</s>
