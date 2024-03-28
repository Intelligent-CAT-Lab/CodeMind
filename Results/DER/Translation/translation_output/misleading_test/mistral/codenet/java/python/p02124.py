<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
ai133

```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}

```
[/INST]
```python
# Sample test case
x = int(input())

# Expected output
ans = "ai1333"

# Loop through x/100 times and append "3" to ans
for i in range(x // 100):
    ans += "3"

# Print the final answer
print(ans)
```</s>
