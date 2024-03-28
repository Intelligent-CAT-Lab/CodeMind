<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


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

python code:<fim_suffix><fim_middle>

```python
import sys

x = int(sys.stdin.readline())
ans = "ai1333"
for i in range(x//100):
	ans += "3"
print(ans)

```
<|endoftext|>
