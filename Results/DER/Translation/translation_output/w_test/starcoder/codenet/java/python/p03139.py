<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
3 0


```
import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

N = int(sys.stdin.readline())
A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
print(min(A, B), max(0, A + B - N))
```
<|endoftext|>
