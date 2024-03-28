<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    top = sys.stdin.readline().strip()
    score = 0
    cpp = False
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

if __name__ == '__main__':
    main()
```
Note that in Python, we use `sys.stdin.readline()` to read a line from the standard input, and `strip()` to remove the newline character at the end of the line. We also use `range(len(top))` to iterate over the characters in the string `top`.</s>
