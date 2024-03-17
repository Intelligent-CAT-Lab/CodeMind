<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
432

Expected output:
400


```
import java.util.Scanner;

public class p02842 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0;i<=N;i++) {
			if ((int)(i*1.08)==N) {
				System.out.println(i);
				return ;
			}
		}
		System.out.println(":(");
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

N = int(sys.stdin.readline())
for i in range(N+1):
    if i*1.08 == N:
        print(i)
        break
else:
    print(':(')
```
<|endoftext|>
