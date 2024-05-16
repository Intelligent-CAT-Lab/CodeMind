System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f? "Yes" : "No";
		System.out.println(ret);
	}
}

```


Answer:
```python
import sys

N = int(input())

f = False
for A in range(1, 10):
    if N % A == 0 and N // A < 10:
        f = True
        break

print("Yes" if f else "No")
```<|endoftext|>
