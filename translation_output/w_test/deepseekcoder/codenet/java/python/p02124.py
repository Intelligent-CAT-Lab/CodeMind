<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
def p02124():
    ans = "ai1333"
    x = int(input())
    for i in range(x//100):
        ans += "3"
    print(ans)

p02124()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, adds the appropriate number of "3"s to the string "ai1333", and then prints the result.
<|EOT|>
