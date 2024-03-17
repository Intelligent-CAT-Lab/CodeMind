<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


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
def p02149():
    nums = list(map(int, input().split()))
    max_num = max(nums)
    idx = nums.index(max_num)
    print(chr(ord('A') + idx))

p02149()
```

This Python function reads three integers from the input, finds the maximum and its index, and then prints the corresponding letter. The letter is calculated by converting the index to a character using the ASCII values. The ASCII value of 'A' is 65, so we add the index to this value to get the ASCII value of the corresponding letter. The character is then printed using the `chr` function.
<|EOT|>
