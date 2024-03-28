<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yes


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

@@ Response
```python
def check_path(path):
    for i in range(len(path)):
        if i % 2 == 0:
            if path[i] == 'L':
                return "No"
        else:
            if path[i] == 'R':
                return "No"
    return "Yes"

# Test input
print(check_path("RUDLUDR"))
```

This Python code does the same thing as the Java code. It checks each character in the input string and returns "No" if it encounters an 'L' at an even index or an 'R' at an odd index. If it goes through the entire string without finding any such characters, it returns "Yes".<｜end▁of▁sentence｜>
