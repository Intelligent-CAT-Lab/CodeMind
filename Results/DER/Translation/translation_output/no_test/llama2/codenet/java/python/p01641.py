<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
import java.util.Stack;

public class p01641 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] mem = new int[10];
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : sc.next().toCharArray()) {
			int idx = (c - 33) / 10;
			for (int i = 0; i < Math.abs(pos - idx); ++i) {
				sb.append(idx < pos ? '<' : '>');
			}
			pos = idx;
			for (int i = 0; i < Math.abs(mem[pos] - c); ++i) {
				sb.append(c < mem[pos] ? '-' : '+');
			}
			mem[pos] = c;
			sb.append('.');
		}
		System.out.println(sb);
	}

}
```

### 解题思路

```python
import sys

def main():
    n = int(sys.stdin.readline())
    mem = [0] * 10
    pos = 0
    sb = ''
    for c in sys.stdin.readline().strip():
        idx = ord(c) - 33
        for i in range(abs(pos - idx)):
            sb += '<' if idx < pos else '>'
        pos = idx
        for i in range(abs(mem[pos] - c)):
            sb += '-' if c < mem[pos] else '+'
        mem[pos] = c
        sb += '.'
    print(sb)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p01640](https://leetcode-cn.com/problems/p01640/)
</s>
