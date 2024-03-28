<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
B6M

```
import java.util.Arrays;
import java.util.Scanner;

public class p02987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Arrays.sort(s);
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

```

### Response:
```python
def p02987(s):
    s = sorted(s)
    if s[0]==s[1] and s[2]==s[3] and s[1]!=s[2]:
        return "Yes"
    else:
        return "No"

print(p02987(input()))
```

This Python function takes a string as input, sorts it, and checks if the first two characters are the same and the last two characters are the same. If they are and they are not the same, it returns "Yes". Otherwise, it returns "No".
<|EOT|>
