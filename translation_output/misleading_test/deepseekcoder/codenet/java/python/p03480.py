<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
010

Expected output:
24

```
import java.util.Scanner;

public class p03480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		s += '2';
		int n = s.length(), ans = n - 1;
		for(int i = 0; i < n - 1; ++i) {
			if(s.charAt(i) != s.charAt(i + 1)) {
				int tmp = Math.max(i + 1,  n - i - 2);
				ans = Math.min(ans,  tmp);
			}
		}
		System.out.println(ans);
	}

}

```

### Response:
```python
def p03480():
    s = input()
    s += '2'
    n = len(s)
    ans = n - 1
    for i in range(n - 1):
        if s[i] != s[i + 1]:
            tmp = max(i + 1, n - i - 2)
            ans = min(ans, tmp)
    print(ans)

p03480()
```
<|EOT|>
