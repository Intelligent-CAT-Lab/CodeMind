<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 7

Expected output:
5 6 7 8

```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```
[/INST]
```python
K = int(input())
X = int(input())

for i in range(X - K + 1, X + K):
    if i != X + K:
        print(i, end=" ")
    else:
        print(i)
```</s>
