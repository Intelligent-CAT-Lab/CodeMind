<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
90

```
import java.util.Scanner;

public class p03573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A == B ) {
			System.out.println(C);
		} else if(B == C) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}


	}
}
```
[/INST]
```python
A, B, C = map(int, input().split())

if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)
```</s>
