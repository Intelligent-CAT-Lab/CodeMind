<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1


```
import java.util.*;
public class p03005{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

n, k = map(int, sys.stdin.readline().split())

if k == 1:
    print(0)
else:
    print(n - k)
```
<|endoftext|>
