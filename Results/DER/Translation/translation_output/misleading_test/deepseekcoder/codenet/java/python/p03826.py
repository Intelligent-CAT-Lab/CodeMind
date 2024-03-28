<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
-50

```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```

### Response:
```python
def p03826():
    a, b, c, d = map(int, input().split())
    a, b = a*b, c*d
    print(max(a, b))

p03826()
```

In this Python code, we first read the input using the `input().split()` function, which splits the input into a list of strings. We then convert these strings into integers using the `map()` function. The `*` operator is used to multiply the corresponding elements of the two pairs of numbers. Finally, we print the maximum of the two results using the `max()` function.
<|EOT|>
