<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
# Test input: 1222
# Expected output: 1+2+2+2=7

# Read input
num = input()

# Split input into 4 characters
chars = list(num)

# Convert characters to integers
a = int(chars[0])
b = int(chars[1])
c = int(chars[2])
d = int(chars[3])

# Initialize answer list
ans = ['+', '+', '+']

# Check if a+b+c+d=7
if a + b + c + d == 7:
    ans[0] = '+'
    ans[1] = '+'
    ans[2] = '+'

# Check if a+b+c-d=7
elif a + b + c - d == 7:
    ans[0] = '+'
    ans[1] = '+'
    ans[2] = '-'

# Check if a+b-c+d=7
elif a + b - c + d == 7:
    ans[0] = '+'
    ans[1] = '-'
    ans[2] = '+'

# Check if a-b+c+d=7
elif a - b + c + d == 7:
    ans[0] = '-'
    ans[1] = '+'
    ans[2] = '+'

# Check if a+b-c-d=7
elif a + b - c - d == 7:
    ans[0] = '+'
    ans[1] = '-'
    ans[2] = '-'

# Check if a-b+c-d=7
elif a - b + c - d == 7:
    ans[0] = '-'
    ans[1] = '-'
    ans[2] = '+'

# Check if a-b-c+d=7
elif a - b - c + d == 7:
    ans[0] = '-'
    ans[1] = '-'
    ans[2] = '+'

# Check if a-b-c-d=7
elif a - b - c - d == 7:
    ans[0] = '-'
    ans[1] = '-'
    ans[2] = '-'

# Print answer
print(a, ans[0], b, ans[1], c, ans[2], d, "=7")
```</s>
