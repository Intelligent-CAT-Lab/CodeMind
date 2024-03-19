<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
46

```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```
[/INST]
```python
# Sample test case
n = int(input())

# Expected output
print(ans[n])

# Solution
ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]
```</s>
