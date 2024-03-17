<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Hom


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

In this Python code, we use the built-in `input()` function to read the input from the user. The `int(input()) % 2` part is used to check if the input number is odd or even. If it's odd, `% 2` will return 1, if it's even, it will return 0. We add these 1s and 0s together to get the total number of odd numbers. If this total is 2 or more, we print "Hom", otherwise we print "Tem".
<|EOT|>
