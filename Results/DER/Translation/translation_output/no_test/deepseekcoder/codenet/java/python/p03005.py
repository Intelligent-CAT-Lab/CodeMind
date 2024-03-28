<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03005{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}

```

### Response:
```python
import sys

def p03005():
    ans = 0
    n = int(sys.stdin.readline().strip())
    k = int(sys.stdin.readline().strip())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

p03005()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and if the second integer is 1, it sets `ans` to 0. Otherwise, it subtracts the second integer from the first and assigns the result to `ans`. It then prints `ans`.
<|EOT|>
