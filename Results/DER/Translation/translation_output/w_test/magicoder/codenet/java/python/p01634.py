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
import sys

def check_password(password):
    if len(password) < 6:
        return "INVALID"
    else:
        has_digit = any(char.isdigit() for char in password)
        has_uppercase = any(char.isupper() for char in password)
        has_special = any(not char.isalnum() for char in password)
        if has_digit and has_uppercase and has_special:
            return "VALID"
        else:
            return "INVALID"

for line in sys.stdin:
    line = line.strip()
    if line:
        print(check_password(line))
```

This Python code does the same thing as the Java code. It reads lines from the standard input, checks if the password meets the criteria (at least 6 characters long, containing at least one digit, one uppercase letter, and one special character), and prints the result.<｜end▁of▁sentence｜>
