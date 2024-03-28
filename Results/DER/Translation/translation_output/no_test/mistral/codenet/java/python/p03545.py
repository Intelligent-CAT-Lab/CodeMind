<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    # Read input
    str = input()
    ch = [str[i:i+1] for i in range(4)]

    # Parse integers
    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])

    # Check conditions and print answer
    if a + b + c + d == 7:
        ans = ['+', '+', '+']
    elif a + b + c - d == 7:
        ans = ['+', '+', '-']
    elif a + b - c + d == 7:
        ans = ['+', '-', '+']
    elif a - b + c + d == 7:
        ans = ['-', '+', '+']
    elif a + b - c - d == 7:
        ans = ['+', '-', '-']
    elif a - b + c - d == 7:
        ans = ['-', '-', '+']
    elif a - b - c + d == 7:
        ans = ['-', '-', '-']
    elif a - b - c - d == 7:
        ans = ['-', '-', '-']
    else:
        ans = ['-', '-', '-']

    print(a, ans[0], b, ans[1], c, ans[2], d, "=7")

if __name__ == "__main__":
    main()
```</s>
