<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def check_password_validity(password):
    c1, c2, c3 = 0, 0, 0
    if len(password) < 6:
        return "INVALID"
    else:
        for c in password:
            if c.isdigit():
                c1 += 1
            elif c.isupper():
                c2 += 1
            else:
                c3 += 1
        if c1 > 0 and c2 > 0 and c3 > 0:
            return "VALID"
        else:
            return "INVALID"

for line in sys.stdin:
    line = line.strip()
    if not line:
        break
    print(check_password_validity(line))
```

This Python code does the same thing as the Java code. It reads lines from the standard input, checks if the password is valid according to the rules, and prints the result. The rules are: the password must be at least 6 characters long, contain at least one digit, one uppercase letter, and one non-alphanumeric character.
<|EOT|>
