<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
gpg

Expected output:
0


```
import java.io.*;

public class p03967 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String top = r.readLine();
		boolean cpp = false;
		int score = 0;
		for (int j = 0; j < top.length(); j++) {
			if (cpp) {
				if (top.charAt(j) == 'g')
					score++;
				cpp = false;
			}
			else {
				if (top.charAt(j) == 'p')
					score--;
				cpp = true;
			}
		}
		System.out.println(score);
	}

}
```

### Response:
```python
import sys

def main():
    top = sys.stdin.readline().strip()
    cpp = False
    score = 0
    for j in range(len(top)):
        if cpp:
            if top[j] == 'g':
                score += 1
            cpp = False
        else:
            if top[j] == 'p':
                score -= 1
            cpp = True
    print(score)

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline().strip()` to read the input from the standard input. The `strip()` function is used to remove any leading or trailing whitespace. The rest of the code is translated directly from the Java code.
<|EOT|>
