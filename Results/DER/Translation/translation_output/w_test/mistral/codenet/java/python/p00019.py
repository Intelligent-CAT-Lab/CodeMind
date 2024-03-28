<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
120


```
import java.util.*;

public class p00019 {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}
```
[/INST]
```python
# input
n = int(input())

# calculation
ans = 1
for i in range(n-1, 0, -1):
    ans *= i

# output
print(ans)
```</s>
