<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atcoder


```
import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}
```

### Response:
```python
def p02817():
    string = input()
    t_string = input()
    print(t_string + string)

p02817()
```
<|EOT|>
