<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def calculate_volume(length, width):
    return (length * width) / 3.305785

if __name__ == "__main__":
    input_values = sys.stdin.readline().split()
    length = float(input_values[0])
    width = float(input_values[1])
    print(calculate_volume(length, width))
```

This Python code reads two numbers from the standard input, calculates the volume of a rectangular prism with these dimensions, and prints the result. The conversion factor from square feet to cubic yards is 3.305785.
<|EOT|>
