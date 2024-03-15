<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

N = int(input())
for i in range(N+1):
    if i*1.08 == N:
        print(i)
        sys.exit()
print(":(")
```</s>
