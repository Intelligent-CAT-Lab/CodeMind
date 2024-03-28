<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
+-++

Expected output:
88

```
import java.util.Scanner;

public class p03315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}


```
[/INST]
```python
# Test input:
# -++

# Expected output:
# 88

# Solution:

# Read input
input = input()

# Convert input to list of characters
ary = list(input)

# Initialize num to 0
num = 0

# Iterate over characters in ary
for c in ary:
    # If c is '+', increment num
    if c == '+':
        num += 1
    # If c is '-', decrement num
    else:
        num -= 1

# Print num
print(num)
```</s>
