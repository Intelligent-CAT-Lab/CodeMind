<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
3


```
import java.util.*;
public class p03844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		if(s.equals("+")) {
			c = a + b;
		}else if(s.equals("-")) {
			c = a - b;
		}
		System.out.print(c);
	}
}
```

python code:<fim_suffix><fim_middle>

```python
a = int(input())
b = int(input())
c = int(input())
op = input()
if op == '+':
    print(a+b)
elif op == '-':
    print(a-b)
```
<|endoftext|>
