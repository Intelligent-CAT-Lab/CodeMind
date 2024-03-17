<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n, m = map(int, sys.stdin.readline().split())

nComb = n * (n-1) / 2
mComb = m * (m-1) / 2

print(int(nComb + mComb))
```
<|endoftext|>
