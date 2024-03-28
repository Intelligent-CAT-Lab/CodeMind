<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5

Expected output:
68

```
import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}

```
[/INST]
```python
A, B = map(int, input().split())
print(A*B)
```</s>
