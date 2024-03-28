<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
1h[VsO1|s

```
import java.util.Scanner;
public class p03206 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int D=stdIn.nextInt();
		if(D==25)
			System.out.println("Christmas");
		if(D==24)
			System.out.println("Christmas Eve");
		if(D==23)
			System.out.println("Christmas Eve Eve");
		if(D==22)
			System.out.println("Christmas Eve Eve Eve");
	}
}
```

### Response:
```python
def count_down(D):
    if D == 25:
        return "Christmas"
    elif D == 24:
        return "Christmas Eve"
    elif D == 23:
        return "Christmas Eve Eve"
    elif D == 22:
        return "Christmas Eve Eve Eve"

D = int(input())
print(count_down(D))
```

In this Python code, we define a function `count_down` that takes an integer `D` as input and returns a string based on the value of `D`. If `D` is 25, the function returns "Christmas". If `D` is 24, the function returns "Christmas Eve". If `D` is 23, the function returns "Christmas Eve Eve". If `D` is 22, the function returns "Christmas Eve Eve Eve". The value of `D` is read from the standard input and the result of the function is printed to the standard output.
<|EOT|>
