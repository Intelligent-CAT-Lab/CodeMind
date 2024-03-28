<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABC

Expected output:
++++++++[>++++++++<-]>+.+.+.


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
				sb.append(idx < pos? '<' : '>');
			}
			pos = idx;
			for (int i = 0; i < Math.abs(mem[pos] - c); ++i) {
				sb.append(c < mem[pos]? '-' : '+');
			}
			mem[pos] = c;
			sb.append('.');
		}
		System.out.println(sb);
	}

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
	mem = [0] * 10
	pos = 0
	sb = []
	for c in sys.stdin.readline().strip():
		idx = (ord(c) - 33) / 10
		for i in range(abs(pos - idx)):
			sb.append(idx < pos? '<' : '>')
		pos = idx
		for i in range(abs(mem[pos] - ord(c))):
			sb.append(ord(c) < mem[pos]? '-' : '+')
		mem[pos] = ord(c)
		sb.append('.')
	print ''.join(sb)

if __name__ == '__main__':
	main()
```
'''
<|endoftext|>
