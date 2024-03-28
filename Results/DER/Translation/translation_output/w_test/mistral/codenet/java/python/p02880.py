<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
Yes


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
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}

```
[/INST]
```python
N = int(input())
f = False
for A in range(1, 10):
    if N % A == 0 and N // A < 10:
        f = True
print("Yes" if f else "No")
```</s>
