<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:


```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

### Response:
```python
import sys

def find_max_and_print_char(numbers):
    max_num = max(numbers)
    max_index = numbers.index(max_num)
    print(chr(ord('A') + max_index))

numbers = list(map(int, sys.stdin.readline().split()))
find_max_and_print_char(numbers)
```

In this Python code, we first import the `sys` module to read input from the standard input. Then we define a function `find_max_and_print_char` that takes a list of numbers as input. This function finds the maximum number in the list and its index. It then prints the character corresponding to the index. The index is converted to a character by adding 'A' to it and converting the result to a character using the `chr` function. The numbers are read from the standard input and split into a list using the `map` function. The `find_max_and_print_char` function is then called with this list as argument.
<|EOT|>
