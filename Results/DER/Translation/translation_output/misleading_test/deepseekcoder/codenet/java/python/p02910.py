<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
5>/

```
import java.util.Scanner;

public class p02910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
			if (i == N.length() - 1) {
				System.out.println("Yes");
			}
		}
	}

}
```

### Response:
```python
def p02910(N):
    for i in range(len(N)):
        c = N[i]
        if i % 2 == 0:
            if c =='L':
                return "No"
        else:
            if c =='R':
                return "No"
    return "Yes"

print(p02910(input()))
```

This Python code does the same thing as the Java code. It reads a string of characters from the input, and then checks each character in the string. If it finds an 'L' at an even index or an 'R' at an odd index, it returns "No". If it gets through the whole string without finding any of these characters, it returns "Yes".
<|EOT|>
