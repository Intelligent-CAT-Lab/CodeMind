<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
gpg

Expected output:
34

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

def p03967():
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

p03967()
```

This Python code reads a line from standard input, then iterates over each character in the line. If the previous character was 'p', it decreases the score by 1. If the previous character was 'g', it increases the score by 1. The final score is printed to standard output.
<|EOT|>
