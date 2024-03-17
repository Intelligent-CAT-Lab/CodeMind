<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def calculate_volume(length, width):
    return (length * width) / 3.305785

if __name__ == "__main__":
    for line in sys.stdin:
        length, width = map(float, line.split())
        print(calculate_volume(length, width))
```

In this Python code, we define a function `calculate_volume` that takes the length and width as input and returns the volume. We then read the input from the standard input (sys.stdin), split it into length and width, convert them to float, and pass them to the `calculate_volume` function. The result is then printed.<｜end▁of▁sentence｜>
