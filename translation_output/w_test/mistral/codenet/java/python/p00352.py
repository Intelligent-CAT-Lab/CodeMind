<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
2000


```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```
[/INST]
```python
# Python code for p00352

# Taking input from user
a = int(input())
b = int(input())

# Calculating the average of two numbers
result = (a + b) // 2

# Printing the result
print(result)
```</s>
