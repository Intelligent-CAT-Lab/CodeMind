<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2


```
import java.util.*;
public class p03047 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// æ´æ°ã®å¥å
		int n = sc.nextInt();
		int k= sc.nextInt();
		
		System.out.println(n-k+1);

	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n,k = map(int,sys.stdin.readline().split())
print(n-k+1)
```
<|endoftext|>
