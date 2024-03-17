<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5700

Expected output:
5500


```
import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}


```

### Response:
```python
p = int(input())
print(p // 500 * 500)
```
<|EOT|>
