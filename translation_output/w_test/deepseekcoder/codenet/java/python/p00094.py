<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
113.437508


```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```

### Response:
```python
import sys

def calculate_volume(length, width):
    return (length * width) / 3.305785

for line in sys.stdin:
    length, width = map(float, line.split())
    print(calculate_volume(length, width))
```

This Python code does the same thing as the Java code. It reads from the standard input, splits each line into two numbers, calculates the volume using the `calculate_volume` function, and then prints the result. The `calculate_volume` function takes two arguments, `length` and `width`, and returns the volume of a rectangular prism with those dimensions.
<|EOT|>
