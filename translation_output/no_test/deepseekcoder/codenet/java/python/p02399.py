<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())

    d = a//b
    r = a%b
    f = "{:.5f}".format(a / b)

    print(d, r, f)

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline().strip()` to read input from the console. The `//` operator is used for integer division and the `%` operator is used for modulus. The `"{:.5f}".format()` string formatting is used to format the float to 5 decimal places.
<|EOT|>
