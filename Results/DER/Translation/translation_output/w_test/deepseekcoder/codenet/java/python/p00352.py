<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
def main():
    a, b = map(int, input().split())
    print((a + b) // 2)

if __name__ == '__main__':
    main()
```

In this Python code, we use the built-in `input()` function to read the input from the user. The `split()` function is used to split the input into two parts. The `map()` function is used to convert these parts into integers. The `//` operator is used for integer division in Python.
<|EOT|>
