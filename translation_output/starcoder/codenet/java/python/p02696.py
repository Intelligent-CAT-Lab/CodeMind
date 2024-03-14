<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```

python code:<fim_suffix><fim_middle>
```python
import sys
a,b,n = map(int,sys.stdin.readline().split())
if n>=b:
	print(a*(b-1)//b)
else:
	print(a*n//b)
```
'''
<|endoftext|>
