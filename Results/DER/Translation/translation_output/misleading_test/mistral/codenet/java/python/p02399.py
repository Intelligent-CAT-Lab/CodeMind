<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1

```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```
[/INST]
```python
# Sample test case
a = int(input())
b = int(input())

# Calculate d and r
d = a // b
r = a % b

# Calculate f
f = "{:.5f}".format(1.0 * a / b)

# Print output
print(d, r, f)
```</s>
