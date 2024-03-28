<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
66.94277711156654

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
Here is the Python equivalent of the given Java code:

```python
import sys

def calculate_volume(length, width):
    return (length * width) / 3.305785

if __name__ == "__main__":
    for line in sys.stdin:
        length, width = map(float, line.split())
        print(calculate_volume(length, width))
```

This Python script reads the input from the standard input (stdin), splits it into two numbers (length and width), and then calculates the volume using the `calculate_volume` function. The result is then printed to the standard output (stdout).<｜end▁of▁sentence｜>
