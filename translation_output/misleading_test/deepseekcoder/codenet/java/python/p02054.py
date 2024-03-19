<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Ho

```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```

### Response:
```python
def p02054():
    odd = 0
    for i in range(3):
        odd += int(input()) % 2
    print("Hom" if odd >= 2 else "Tem")

p02054()
```

In this Python code, we use the built-in `input()` function to read the input from the user. The `int(input()) % 2` expression checks if the input number is odd or even by taking the modulus of 2. If the result is 1, the number is odd and we increment the `odd` counter. Finally, we print "Hom" if `odd` is greater than or equal to 2, otherwise we print "Tem".
<|EOT|>
