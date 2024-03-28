<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python

def main():
    num = input()
    a, b, c, d = map(int, num)
    ans = [0, 0, 0]

    if a + b + c + d == 7:
        ans = ["+", "+", "+"]
    elif a + b + c - d == 7:
        ans = ["+", "+", "-"]
    elif a + b - c + d == 7:
        ans = ["+", "-", "+"]
    elif a - b + c + d == 7:
        ans = ["-", "+", "+"]
    elif a + b - c - d == 7:
        ans = ["+", "-", "-"]
    elif a - b + c - d == 7:
        ans = ["-", "+", "-"]
    elif a - b - c + d == 7:
        ans = ["-", "-", "+"]
    elif a - b - c - d == 7:
        ans = ["-", "-", "-"]

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7")

if __name__ == "__main__":
    main()

```

This Python code does the same thing as the Java code. It reads a four-digit number from the user, then checks all possible combinations of addition and subtraction to see if they add up to 7. If a combination is found, it prints the expression with the correct operators.<｜end▁of▁sentence｜>
