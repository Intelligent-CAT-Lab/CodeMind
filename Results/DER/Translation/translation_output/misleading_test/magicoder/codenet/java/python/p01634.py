<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
password

Expected output:
INVALID

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01634 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int c1, c2, c3;
			c1 = c2 = c3 = 0;
			if (line.length() < 6) {
				System.out.println("INVALID");
			} else {
				for (char c : line.toCharArray()) {
					if (c >= '0' && c <= '9') {
						c1++;
					} else if (c >= 'A' && c <= 'Z') {
						c2++;
					} else {
						c3++;
					}
				}
				if (c1 > 0 && c2 > 0 && c3 > 0) {
					System.out.println("VALID");
				} else {
					System.out.println("INVALID");
				}
			}
		}
	}
}
```

@@ Response
```python
import re

def check_password(password):
    if len(password) < 6:
        return "INVALID"
    else:
        if re.search(r'\d', password) and re.search(r'[A-Z]', password) and re.search(r'[^A-Za-z0-9]', password):
            return "VALID"
        else:
            return "INVALID"

password = input()
print(check_password(password))
```

This Python code does the same thing as the Java code. It reads a password from the user, checks if it's at least 6 characters long, and then checks if it contains at least one digit, one uppercase letter, and one non-alphanumeric character. If all these conditions are met, it prints "VALID", otherwise it prints "INVALID".<｜end▁of▁sentence｜>
