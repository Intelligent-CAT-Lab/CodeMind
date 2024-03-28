<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

N = int(sys.stdin.readline())

ans = 1
for i in range(N-1):
	ans *= N

print(ans)
```

'''
<|endoftext|>
