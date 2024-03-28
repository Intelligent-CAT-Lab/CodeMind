<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def check_password(password):
    c1, c2, c3 = 0, 0, 0
    if len(password) < 6:
        return "INVALID"
    for char in password:
        if char >= '0' and char <= '9':
            c1 += 1
        elif char >= 'A' and char <= 'Z':
            c2 += 1
        else:
            c3 += 1
    if c1 > 0 and c2 > 0 and c3 > 0:
        return "VALID"
    else:
        return "INVALID"

if __name__ == "__main__":
    while True:
        password = input("Enter password: ")
        if password == "exit":
            break
        print(check_password(password))
```</s>
