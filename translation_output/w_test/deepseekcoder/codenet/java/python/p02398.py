<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
3


```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}


```

### Response:
```python
def p02398():
    x, y, z = map(int, input().split())
    t = 0
    for i in range(x, y+1):
        if z % i == 0:
            t += 1
    print(t)

p02398()
```

This Python function reads three integers from the standard input, then counts how many numbers in the range from `x` to `y` (inclusive) divide `z` evenly. The count is then printed to the standard output.
<|EOT|>
