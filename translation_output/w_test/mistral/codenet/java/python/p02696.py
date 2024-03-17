<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


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
[/INST]
```python
a = int(input())
b = int(input())
n = int(input())

if n >= b:
    print(a * (b - 1) // divide by b
else:
    print(a * n // divide by b
```</s>
