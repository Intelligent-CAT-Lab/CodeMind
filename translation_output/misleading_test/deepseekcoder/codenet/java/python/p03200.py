<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBW

Expected output:
-42

```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```

### Response:
```python
def p03200():
    count = 0
    s = input()
    black = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1
    print(count)

p03200()
```

This Python function will take a string as input, and then it will count the number of 'W's in the string. For each 'W', it will add the number of 'B's encountered so far to a total count. The function will then print the total count.
<|EOT|>
