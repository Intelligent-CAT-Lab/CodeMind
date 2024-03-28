<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Hom


```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```
[/INST]
```python
# Sample test case
n = int(input())
a = list(map(int, input().split()))

# Expected output
print("Hom" if sum(1 for x in a if x % 2 == 1) >= 2 else "Tem")
```</s>
