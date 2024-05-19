System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

n, m = map(int, sys.stdin.readline().split())

nComb = n * (n-1) // 2
mComb = m * (m-1) // 2

print(nComb + mComb)
```<|endoftext|>
