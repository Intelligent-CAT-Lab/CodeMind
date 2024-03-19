<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000

Expected output:
6BC

```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```

### Response:
```python
def p03813(n):
    return "ABC" if n < 1200 else "ARC"

print(p03813(int(input())))
```

In this Python code, we define a function `p03813` that takes an integer `n` as input. If `n` is less than 1200, the function returns "ABC". Otherwise, it returns "ARC". The result is then printed to the console.
<|EOT|>
