<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
AC


```
import java.util.Scanner;

public class p03289 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		if (c[0] != 'A') {
			System.out.println("WA");
			return;
		}
		int count = 0;
		int index = 0;
		for (int i = 2; i < c.length - 1; i++) {
			if (c[i] == 'C') {
				count++;
				index = i;
			}
		}
		if (count != 1) {
			System.out.println("WA");
			return;
		}

		for (int i = 0; i < c.length; i++) {
			if (i == 0 || i == index) {
				continue;
			}
			if (c[i] >= 'A' && c[i] <= 'Z') {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
		sc.close();
	}
}
```
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    if input_string[0] != 'A':
        print("WA")
        return
    count = 0
    index = 0
    for i in range(2, len(input_string) - 1):
        if input_string[i] == 'C':
            count += 1
            index = i
    if count != 1:
        print("WA")
        return
    for i in range(len(input_string)):
        if i == 0 or i == index:
            continue
        if input_string[i] >= 'A' and input_string[i] <= 'Z':
            print("WA")
            return
    print("AC")

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The code first reads the input string from the standard input using `sys.stdin.readline().strip()`. It then checks if the first character of the input string is 'A' and if it is not, it prints "WA" and returns.

The code then initializes two variables, `count` and `index`, to 0 and 0 respectively. It then loops through the input string starting from the second character and ending at the second-to-last character. For each character, it checks if it is 'C' and if it is, it increments `count` and sets `index` to the current index.

After the loop, the code checks if `count` is equal to 1. If it is not, it prints "WA" and returns.

The code then loops through the input string again, starting from the first character and ending at the last character. For each character, it checks if it is not the first or second character and if it is not 'A' or 'C'. If it is, it prints "WA" and returns.

If the code reaches the end of the loop, it prints "AC" and returns.

The code is enclosed in a `main()` function and the `if __name__ == "__main__":` block is used to ensure that the code is only executed when the file is run as a script.</s>
