Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

while True:
    try:
        a, b = map(float, input().split())
        print((a*b)/3.305785)
    except EOFError:
        break
```

Explanation:

- We use the `map()` function to convert the input string to a list of floats.
- We use the `try-except` block to handle the case when the input is empty.
- We use the `while` loop to keep asking for input until the user enters an empty line.
- We use the `print()` function to output the result.<|endoftext|>
