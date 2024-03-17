<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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

Here is the Python code that translates the Java code:
```python
import sys

def main():
    str = sys.stdin.readline().strip()
    ch = [str[i] for i in range(4)]

    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])

    ans = ["+", "+", "+"]

    if a + b + c + d == 7:
        pass
    elif a + b + c - d == 7:
        ans[2] = "-"
    elif a + b - c + d == 7:
        ans[1] = "-"
    elif a - b + c + d == 7:
        ans[0] = "-"
    elif a + b - c - d == 7:
        ans[1] = "-"
        ans[2] = "-"
    elif a - b + c - d == 7:
        ans[0] = "-"
        ans[2] = "-"
    elif a - b - c + d == 7:
        ans[0] = "-"
        ans[1] = "-"
    elif a - b - c - d == 7:
        ans[0] = "-"
        ans[1] = "-"
        ans[2] = "-"

    print(a + ans[0] + b + ans[1] + c + ans[2] + d + "=7")

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from the command line, and the `strip()` method to remove any trailing whitespace from the input string. The `range()` function is used to iterate over the characters in the input string, and the `int()` function is used to convert the characters to integers. The `if` statements are used to check the different combinations of the input numbers, and the `ans` list is used to store the operators that need to be used to make the sum equal to 7. Finally, the `print()` function is used to output the result.</s>
