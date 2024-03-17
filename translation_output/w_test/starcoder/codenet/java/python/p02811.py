<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Yes


```
import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

K, X = map(int, sys.stdin.readline().split())

if X <= 500*K:
    print("Yes")
else:
    print("No")
```
<|endoftext|>
