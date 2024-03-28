<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

for line in sys.stdin:
    a, b = map(float, line.split())
    print(a * b / 3.305785)
```

This Python code reads from the standard input (stdin), splits each line into two numbers, multiplies them, and then divides by 3.305785. The result is then printed to the standard output (stdout).<｜end▁of▁sentence｜>
