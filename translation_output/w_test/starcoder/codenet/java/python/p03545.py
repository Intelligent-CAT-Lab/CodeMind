<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1222

Expected output:
1+2+2+2=7


```


import java.util.Scanner;

public class p03545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String[] ch = new String[4];

		for (int i = 0; i < 4; i++) {
			ch[i] = str.substring(i, i + 1);
		}

		int a = Integer.parseInt(ch[0]);
		int b = Integer.parseInt(ch[1]);
		int c = Integer.parseInt(ch[2]);
		int d = Integer.parseInt(ch[3]);

		String[] ans = new String[3];

		if (a + b + c + d == 7) {
			ans[0] = "+";
			ans[1] = "+";
			ans[2] = "+";
		} else if (a + b + c - d == 7) {
			ans[0] = "+";
			ans[1] = "+";
			ans[2] = "-";
		} else if (a + b - c + d == 7) {
			ans[0] = "+";
			ans[1] = "-";
			ans[2] = "+";
		} else if (a - b + c + d == 7) {
			ans[0] = "-";
			ans[1] = "+";
			ans[2] = "+";
		} else if (a + b - c - d == 7) {
			ans[0] = "+";
			ans[1] = "-";
			ans[2] = "-";
		} else if (a - b + c - d == 7) {
			ans[0] = "-";
			ans[1] = "+";
			ans[2] = "-";
		} else if (a - b - c + d == 7) {
			ans[0] = "-";
			ans[1] = "-";
			ans[2] = "+";
		} else if (a - b - c - d == 7) {
			ans[0] = "-";
			ans[1] = "-";
			ans[2] = "-";
		}

		System.out.println(a + ans[0] + b + ans[1] + c + ans[2] + d + "=7");
	}

}

```

python code:<fim_suffix><fim_middle>

```python

import sys

def main():
	str = sys.stdin.readline().strip()
	ch = [str[i:i+1] for i in range(4)]
	a = int(ch[0])
	b = int(ch[1])
	c = int(ch[2])
	d = int(ch[3])

	ans = ['', '', '']

	if a + b + c + d == 7:
		ans[0] = '+'
		ans[1] = '+'
		ans[2] = '+'
	elif a + b + c - d == 7:
		ans[0] = '+'
		ans[1] = '+'
		ans[2] = '-'
	elif a + b - c + d == 7:
		ans[0] = '+'
		ans[1] = '-'
		ans[2] = '+'
	elif a - b + c + d == 7:
		ans[0] = '-'
		ans[1] = '+'
		ans[2] = '+'
	elif a + b - c - d == 7:
		ans[0] = '+'
		ans[1] = '-'
		ans[2] = '-'
	elif a - b + c - d == 7:
		ans[0] = '-'
		ans[1] = '+'
		ans[2] = '-'
	elif a - b - c + d == 7:
		ans[0] = '-'
		ans[1] = '-'
		ans[2] = '+'
	elif a - b - c - d == 7:
		ans[0] = '-'
		ans[1] = '-'
		ans[2] = '-'

	print(a + ans[0] + b + ans[1] + c + ans[2] + d + '=7')

if __name__ == '__main__':
	main()

```
<|endoftext|>
