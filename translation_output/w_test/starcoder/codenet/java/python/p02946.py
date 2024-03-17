<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 7

Expected output:
5 6 7 8 9


```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i!= X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

K, X = map(int, sys.stdin.readline().split())

for i in range(X - K + 1, X + K):
    if i!= X + K - 1:
        print(i, end=' ')
    else:
        print(i)

```
<|endoftext|>
