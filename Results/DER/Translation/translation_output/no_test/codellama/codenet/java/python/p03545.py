<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:



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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    str = sys.stdin.readline().strip()
    ch = [str[i] for i in range(4)]
    a, b, c, d = map(int, ch)
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

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d} = 7")

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read input from the user and the `map` function to convert the input string to a list of integers. The rest of the code is similar to the Java code, with some minor changes to make it more Pythonic.</s>
