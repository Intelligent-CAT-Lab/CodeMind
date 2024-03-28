<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    S = sys.stdin.readline().strip()
    c = list(S)
    if c[0] != 'A':
        print("WA")
        return
    count = 0
    index = 0
    for i in range(2, len(c) - 1):
        if c[i] == 'C':
            count += 1
            index = i
    if count != 1:
        print("WA")
        return
    for i in range(len(c)):
        if i == 0 or i == index:
            continue
        if c[i] >= 'A' and c[i] <= 'Z':
            print("WA")
            return
    print("AC")

if __name__ == "__main__":
    main()
```
Note that the `sys.stdin.readline().strip()` line is used to read a line of input from the user and remove any trailing newline characters. The `list(S)` line is used to convert the input string into a list of characters. The rest of the code is similar to the Java code, with the exception of the `continue` statement, which is not needed in Python.</s>
