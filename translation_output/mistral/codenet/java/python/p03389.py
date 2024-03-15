<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03389 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int M = Math.max(A, Math.max(B, C));

		if((A+B+C)%2 == M%2) {
			System.out.println((3*M-(A+B+C))/2);
		}else {
			System.out.println(((3*M+3)-(A+B+C))/2);
		}

	}

}

```
[/INST]
```python
import sys

A = int(input())
B = int(input())
C = int(input())
M = max(A, max(B, C))

if (A + B + C) % 2 == M % 2:
    print((3 * M - (A + B + C)) / 2)
else:
    print(((3 * M + 3) - (A + B + C)) / 2)
```</s>
