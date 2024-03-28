<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 17

Expected output:
83


```
import java.util.Scanner;

public class p03609 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}
```

### Response:
```python
def p03609():
    x, t = map(int, input().split())
    if x > t:
        print(x-t)
    else:
        print("0")

p03609()
```
<|EOT|>
