<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
15


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
    a *= b
    c *= d
    print(max(a, c))

p03826()
```

This Python function reads four integers from the input, multiplies the first two and the last two, and then prints the maximum of the two results.
<|EOT|>
