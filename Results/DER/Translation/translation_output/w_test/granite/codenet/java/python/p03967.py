System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    top = sys.stdin.readline().strip()
    score = 0
    for i in range(len(top)):
        if i % 2 == 0:
            if top[i] == 'g':
                score += 1
        else:
            if top[i] == 'p':
                score -= 1
    print(score)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "gpg"
expected_output = 0
output = main(test_input)
assert output == expected_output, "Test failed"
```<|endoftext|>
