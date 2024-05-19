System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}

```


Answer:
```python
import sys

ans = "ai1333"
x = int(sys.stdin.read())
for i in range(x//100):
    ans += "3"
print(ans)
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "0"
expected_output = "ai1333"
output = subprocess.check_output(["python", "p02124.py"], input=test_input, text=True)
assert output.strip() == expected_output
```<|endoftext|>
